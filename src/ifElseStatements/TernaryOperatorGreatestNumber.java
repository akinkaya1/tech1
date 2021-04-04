package ifElseStatements;

import java.util.Scanner;

public class TernaryOperatorGreatestNumber {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter 2 numbers and print out the greatest number
        Use ternary operator to solve the problem

        Test data:
        Number1 = 12
        Number2 = 17

        Expected output:
        17
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int number1 = scan.nextInt();

        System.out.println("Please enter second number: ");
        int number2 = scan.nextInt();

        /*
        if(number1 > number2){
            System.out.println("The greatest number is: " + number1);
        }
        else{
            System.out.println("The greatest number is: " + number2);
        }
        */

        //variable = expression1 ? Expression2 : expression3 -> Syntax of ternary operator

        int greatestNumber = number1 > number2 ? number1 : number2;

        System.out.println("The greatest number is " + greatestNumber);
    }
}
