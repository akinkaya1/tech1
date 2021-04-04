package arrays.practiceArrayManipulation;

import java.util.Arrays;

public class FindingTheSecondGreatestNumberInAnArrayWithSorting {
    public static void main(String[] args) {

        int[] numbers = {4, 0, 8, 4, 67, 67, -10, -10, 67, -10};

        System.out.println(Arrays.toString(numbers)); // [4, 0, 8, 4, 67, 67, -10, -10, 67, -10]

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers)); // [-10, -10, -10, 0, 4, 4, 8, 67, 67, 67]

        int greatest = numbers[numbers.length-1];
        int smallest = numbers[0]; // -10

        int secondSmallest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] != smallest) {
                secondSmallest = numbers[i];
                break;
            }
        }

        System.out.println("Smallest = " + smallest);
        System.out.println("Second smallest = " + secondSmallest);


        int secondGreatest = numbers[0]; //-10

        for (int i = numbers.length-1; i >= 0 ; i--) {
            if(numbers[i] != greatest){
                secondGreatest = numbers[i];
                break;
            }
        }

        System.out.println("Greatest = " + greatest);
        System.out.println("Second greatest = " + secondGreatest);

        String[] items = {"HOME"};

    }
}
