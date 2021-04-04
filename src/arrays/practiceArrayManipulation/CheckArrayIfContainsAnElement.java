package arrays.practiceArrayManipulation;

import java.util.Arrays;

public class CheckArrayIfContainsAnElement {
    public static void main(String[] args) {
        /*
        Check if this list of array has element "strawberry"
        if it has "strawberry", then print true
        if it does not have "strawberry", then print false

        Result:
        true
        */

        String[] list = {"apple", "pineapple", "banana", "peach", "grapes", "strawberry"};

        boolean check = false;

        for (String element: list) {
            if(element.equalsIgnoreCase("strawberry")) {
                check = true;
                break;
            }
        }

       System.out.println(check);


        /*
        Create an array that holds {'A', 'k', 'L', '#', '$'}
        Check if there is 'K' in this array
        And return true if it does or false if it does not

        Result:
        false
         */

        char[] chars = {'A', 'k', 'L', '#', '$'};

        boolean checkChar = false;

        for(char element: chars){
            if(element == 'K') {
                checkChar = true;
                break;
            }
        }

        System.out.println(checkChar);

        /*
        Check if array { 4, 6, 2, 10 } contains 2 or not
        If it has 2, then return true
        else, return false
        NOTE: use binarySearch() method
         */

        int[] numbers = { 4, 6, 2, 10 };

        Arrays.sort(numbers); // 2, 4, 6, 10

        int indexOf2 = Arrays.binarySearch(numbers, 2);

        System.out.println("The index of array with binary search is: " + indexOf2);

        if(indexOf2 < 0) System.out.println("false");
        else System.out.println("true");


        /*
        Check if array { "java", "ruby", "html" } has javascript
        If it has javascript, then return true
        else, return false
        NOTE: use binarySearch() method
         */

        String[] arr = { "java", "ruby", "html" };

        Arrays.sort(arr); // html, java, ruby
        boolean flag = false;

        if(Arrays.binarySearch(arr, "javascript") >= 0){
            flag = true;
        }

        System.out.println(Arrays.binarySearch(arr, "javascript"));
        System.out.println("Binary search for javascript result is: " + flag); // false
    }
}
