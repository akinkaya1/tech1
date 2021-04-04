package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Animals {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        // dog, cat, cow, rabbit
        animals.add("dog");
        animals.add("cat");
        animals.add("cow");
        animals.add("rabbit");
        animals.add("cow");
        animals.add("cow");
        animals.add("cow");
        animals.add("cow");

        System.out.println("List before removing"+ animals);
        animals.remove("cat");
        animals.remove(animals.indexOf("rabbit"));

        removeElement(animals, "cow");

        System.out.println("List after removing"+ animals);

    }

    public static void removeElement(ArrayList<String> list, String elementToRemove){

        List<String> elementsToRemove = new ArrayList<>();

        for (String str: list) {
            if(str.equals(elementToRemove)) elementsToRemove.add(str);
        }

        list.removeAll(elementsToRemove);
    }
}
