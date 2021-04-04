package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UnderstandingLinkedList {
    public static void main(String[] args) {

        //Creating ArrayLists
        ArrayList<String> names = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        //Creating LinkedLists
        LinkedList<String> animals = new LinkedList<>();
        List<Character> chars = new LinkedList<>();

        //Adding elements to LinkedList is same as adding elements to ArrayList
        //And also all the methods we learned for ArrayList are doing same with LinkedList
        //LinkedList has more methods to manipulate data like addFirst(), addLast(), getFirst(), getLast()
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);


    }
}
