package arrays.practiceArrayManipulation;

import java.util.Arrays;

public class FindingTheSecondGreatestNumberInAnArray {
    public static void main(String[] args) {

        int[] numbers = {4, 0, 8, 4, 67, 67, -10, -10};
        System.out.println(Arrays.toString(numbers));
        int greatest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > greatest) greatest = numbers[i];
        }

        System.out.println("The greatest is = " + greatest);

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == greatest) numbers[i] = 0;
        }

        System.out.println(Arrays.toString(numbers));

        int secondGreatest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > secondGreatest) secondGreatest = numbers[i];
        }

        System.out.println("The second greatest is = " + secondGreatest);

    }
}
