package collections;

import java.util.Arrays;

public class RecapArray {
    public static void main(String[] args) {
        /*
        Create an array
        And store cities below
        Then print the array

        Cities: Tokyo, Chicago, Istanbul
         */

        //First way
        String[] cities1 = {"Tokyo", "Chicago", "Istanbul"};
        System.out.println(Arrays.toString(cities1)); // [Tokyo, Chicago, Istanbul]

        //Second way
        String[] cities2 = new String[3];
        cities2[0] = "Tokyo";
        cities2[1] = "Chicago";
        cities2[2] = "Istanbul";

        for (String city: cities2) {
            System.out.println(city);
        }
    }
}
