package arrays.practiceArrayManipulation;

import java.util.Arrays;
import java.util.Random;

public class FindAverageOfIntArrayElements {
    /**
    Create an int array, size of 7
    And assign 7 integers to your array
    Then print your array first
    Finally, print average of your elements

     PSEUDO CODE
     -Create an int array and assign 7 integers
     -Print array to see your elements
     -Loop through each element and find sum of elements
     -Find average and print
     */
    public static void main(String[] args) {
        int[] numbers = new int[7];

        System.out.println(numbers.length); // 7
        System.out.println(Arrays.toString(numbers)); // [0, 0, 0, 0, 0, 0, 0]

        //Let's assign random 7 numbers to this array
        Random r = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(10)+1;
        }

        System.out.println(Arrays.toString(numbers));

        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }

        System.out.println("Sum of the elements is: " + sum);
        System.out.println("Average of elements is: " + (double)sum/numbers.length);
    }
}
