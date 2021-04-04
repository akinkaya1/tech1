package scanner;

import java.util.Scanner;

public class SumOfNumbers1 {
    /*
    Write a Java program that asks user to enter 3 numbers and print the sum of those 3 numbers

    PSEUDO CODE
    1. Declare 3 int variables
    2. Create Scanner Object
    3. Ask user to enter 3 numbers respectively, and store those numbers in your variables
    4. Print sum of the numbers
     */
    public static void main(String[] args) {
        int number1, number2, number3, sum;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number 1: ");
        number1 = input.nextInt();

        System.out.print("Please enter number 2: ");
        number2 = input.nextInt();

        System.out.print("Please enter number 3: ");
        number3 = input.nextInt();

        sum = number1 + number2 + number3;

        System.out.println("Sum of those 3 numbers is: " + sum);
    }
}
