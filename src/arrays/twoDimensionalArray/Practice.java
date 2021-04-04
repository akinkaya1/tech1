package arrays.twoDimensionalArray;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        /*
        Create a 2-dimensional array and store 3 inner arrays in that
        in the first array, store 5,6,7
        in the second array, store 8,9,10
        in the third array, store 1,2
        find sum of all elements
         */


        int[][] numbers = {{5, 6, 7}, {8, 9, 10}, {1, 2}};

        System.out.println( numbers[0]);
        System.out.println(Arrays.toString(numbers[0]));

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
        }

        System.out.println("Sum is: " + sum);


    }
}
