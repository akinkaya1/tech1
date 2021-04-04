package homework;

import java.util.Arrays;
import java.util.Random;

public class Homework10 {

    public static void main(String[] args) {
        String s = "baNana".toLowerCase();

        //find duplicates in this string, case in-sensitive - ignore case

        String duplicates = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if(i != j && s.charAt(i) == s.charAt(j) && !duplicates.contains(s.charAt(i) + "")){
                    duplicates += s.charAt(i) + " ";
                }
            }
        }

        System.out.println("Duplicates in banana = " + duplicates);

        int[] numbers = {0, 0, 5, 10, 45, -4, -7, 45, 45, 65, -12};

        int firstPositive = 0;
        int firstNegative = 0;

        for (int number: numbers) {
            if(number > 0 && firstPositive == 0) firstPositive = number;
            else if(number < 0 && firstNegative == 0) firstNegative = number;

            if(firstNegative != 0 && firstPositive != 0) break;
        }

        System.out.println("First negative " + firstNegative);
        System.out.println("First positive " + firstPositive);

        // 5 random numbers
        Random r = new Random();

        int[] randomNumbers = new int[5];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = r.nextInt(10) + 1; // 1,2,3,4,5,6,7,8,9,10
        }

        System.out.println("My random numbers array " + Arrays.toString(randomNumbers));

        boolean check2or3 = false;

        for (int num: randomNumbers) {
            if(num == 2 || num == 3) {
                check2or3 = true;
                break;
            }
        }

        System.out.println("My random array contains 2 or 3 = " + check2or3);

        String[] list = {"APple", "banana", "orange", "grapes"};
        boolean isThereApple = false;

        for (String fruit: list) {
            if(fruit.equalsIgnoreCase("apple")) isThereApple = true;
        }

        System.out.println("My list of fruit contains apple = " + isThereApple);

        int[] nums = {0, -4, -7, 0, 5, 10, 45, -7, 0, -4, 45, 8, 8};

        String duplicatedNumbers = "";
        boolean isThereDuplicatedNumber = false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j] && !duplicatedNumbers.contains(nums[i] + "")){
                    duplicatedNumbers += nums[i] + " ";
                    isThereDuplicatedNumber = true;
                }
            }
        }

        if(isThereDuplicatedNumber){
            System.out.println("Duplicated numbers in the array are = " + duplicatedNumbers);
        }
        else{
            System.out.println("There is no duplicates");
        }


        //Print reversed array

        int[] regularNumberArray = {10, 20, 30, 50, 70}; // [70, 50, 30, 20, 10]

        int[] reversedArray = new int[regularNumberArray.length];

        for (int i = 0; i < regularNumberArray.length; i++) {
            reversedArray[i] = regularNumberArray[regularNumberArray.length-1-i];
        }

        System.out.println("My reversed number array is = " + Arrays.toString(reversedArray));
    }
}
