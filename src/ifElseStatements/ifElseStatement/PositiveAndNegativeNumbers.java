package ifElseStatements.ifElseStatement;

import java.util.Scanner;

public class PositiveAndNegativeNumbers {
    public static void main(String[] args) {
        /*
        Ask user to enter a number
        if number is negative, then print "Number is negative"
        else print "Number is not negative"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();

        System.out.println("Entered number is: " + number);
        System.out.println();

        if(number > 0){
            System.out.println("Number is negative");
        }
        else{
            System.out.println("Number is not negative");
        }

        System.out.println("End of the program");
    }
}
