package ifElseStatements.ifStatement;

import java.util.Scanner;

public class EvenNumber {
    /*
    Write a program that asks user to enter a number.
    If the number entered is even, then print message “The number you entered is even!”
     */

    /*
    number % 2 == 0 -> checks if remainder of number by 2 is zero
    if remainder is 0, then the number is even
    if remainder is not zero (1), then number is odd

    TO CHECK if the number is odd
    1. number % 2 != 0
    2. number % 2 == 1
     */
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scan.nextInt();

        boolean isNumberEven = (number % 2 == 0);

        if(isNumberEven){
            System.out.println("The number you entered is even!");
        }
    }
}
