package arrayList;

import java.util.ArrayList;
import java.util.List;

public class RemovePractice {
    public static void main(String[] args) {
        /*
        Create an ArrayList of Character
        And add a, b, c, a, b
        Print each element one by one
         */

        List<Character> chars = new ArrayList<>();

        chars.add('a');
        chars.add('b');
        chars.add('c');
        chars.add('a');
        chars.add('b');

        System.out.println(chars);

        for (int i = 0; i < chars.size(); i++) {
            System.out.println(chars.get(i));
        }

        for (Character element: chars) {
            System.out.println(element);
        }

        /*
        remove duplicates [a, b, c]
        get only uniques
         */

        ArrayList<Character> uniqueElements = new ArrayList<>(); //[]

        for (int i = 0; i < chars.size(); i++) {
            if(!uniqueElements.contains(chars.get(i))) uniqueElements.add(chars.get(i));
        }

        System.out.println("New list with removed duplicates is = " + uniqueElements);

    }
}
