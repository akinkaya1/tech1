package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Fruits {
    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("banana");
        fruits.add("apple");

        fruits.add(0, "strawberry"); // [strawberry, banana, apple]
        fruits.add(1, "pineapple"); // [strawberry, pineapple, banana, apple]
        fruits.add("pineapple");

        fruits.set(3, "orange");

        System.out.println("My fruit list is = " + fruits); // [strawberry, pineapple, banana, orange]

        System.out.println(fruits.indexOf("grapes")); // will return -1
        System.out.println(fruits.lastIndexOf("grapes")); // will return -1
        System.out.println(fruits.indexOf("pineapple")); // will return the first found index
        System.out.println(fruits.lastIndexOf("pineapple")); // will return last found index

        System.out.println(fruits.contains("grapes")); // false
        System.out.println(fruits.contains("orange")); // true


        /**
         HOW TO PRINT FIRST AND LAST ELEMENT IN AN ARRAYLIST
         */

        String firstFruitInTheList = fruits.getFirst();
        String lastFruitInTheList = fruits.getLast();

        System.out.println("First element in the fruit list is = " + firstFruitInTheList);
        System.out.println("Last element in the fruit list is = " + lastFruitInTheList);

        /*
        what is the index of strawberry -> 0
        what is the index of banana -> 2
        what is the index of apple -> 3 // apple is gone and orange came
         */

    }
}
