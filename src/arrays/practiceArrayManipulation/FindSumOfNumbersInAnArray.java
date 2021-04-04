package arrays.practiceArrayManipulation;

import java.util.Arrays;
import java.util.Random;

public class FindSumOfNumbersInAnArray {

    /**
    Create an array, size of 3
    Generate 3 numbers that are between 1 and 100 (1 and 100 are included)
    Print all those elements from array
    Finally, find sum of those elements

     PSEUDO
     -Random class object to generate random 3 numbers
     -Store those random numbers in an array
     -Print array
     -Find sum of elements and print sum
     */

    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random r = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(100) + 1;
            System.out.println("Random number " + (i+1) + " = " + numbers[i]);
        }

        System.out.println(Arrays.toString(numbers));

        int sum = 0;
        for (int element: numbers) {
            sum += element;
        }

        System.out.println("Sum of these 3 random numbers is: " + sum);

        System.out.println(Arrays.stream(numbers).average());
    }
}
