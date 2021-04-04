package arrays;

import java.util.Arrays;

public class LengthOfArray {
    /*
    Create an int array
    And store 1,2,4,6,8 in this array
    Print the length of array
    Print the elements inside the array
     */

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 6, 8};

        System.out.println(numbers.length); // 5

        System.out.println(numbers); // location
        System.out.println(Arrays.toString(numbers)); // [1, 2, 4, 6, 8]

        int a = '1';
        System.out.println(a);
    }
}
