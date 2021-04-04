package ifElseStatements.ifElseIfElseStatements;

import java.util.Scanner;

public class PositiveNegativeAndZero {
    public static void main(String[] args) {
        /*
        Positive numbers that are greater than zero
        Negative numbers that are less than zero
        Zero is neutral
         */

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if(number < 0){
            System.out.println("NEGATIVE");
        }
        else if(number > 0){
            System.out.println("POSITIVE");
        }
        else{
            System.out.println("ZERO");
        }


        if (number <= 0) {
            if (number==0){
                System.out.println("number is neutral");
            }
            else{
                System.out.println("this number is negative");
            }
        }
        else {
            System.out.println("number is positive");
        }
    }
}
