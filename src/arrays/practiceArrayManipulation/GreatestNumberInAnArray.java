package arrays.practiceArrayManipulation;

import java.util.Arrays;
import java.util.Random;

public class GreatestNumberInAnArray {
    public static void main(String[] args) {

        System.out.println("\nFIRST WAY\n");
        int[] numbers = {-107, -8, -11, 58, 65, 105};

        //1.find greatest number in the given array - DO NOT use sort method

        System.out.println(Arrays.toString(numbers));
        int greatest = numbers[0]; // 107

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > greatest) greatest = numbers[i];
        }

        System.out.println(greatest);


        //SECOND WAY WITH RANDOM
        System.out.println("\nSECOND WAY\n");
        Random r = new Random();
        int[] nums = new int[4];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(10);
        }

        System.out.println(Arrays.toString(nums));

        int great = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > great) great = nums[i];
        }

        System.out.println(great);


        //THIRD WAY
        System.out.println("\nTHIRD WAY\n");
        System.out.println(Arrays.toString(numbers));

        int biggest = 0;

        for (int i = 0; i < numbers.length-1; i++) {
            if(numbers[i] > numbers[i+1]) {
                biggest = numbers[i];
            }
            else{
                biggest = numbers[i+1];
            }
        }

        System.out.println(biggest);

    }
}
