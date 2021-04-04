package loops.whileLoop;

import java.util.Scanner;

public class SumOfNumbersByUser {
    /**
    Write a Java program that asks user to enter some numbers and find the sum of numbers given by user

    Example program
    Program: Please enter how many number you want to enter
    User: 3

    Program: Please enter number 1
    User: 10

    Program: Please enter number 2
    User: 7

    Program: Please enter number 3
    User: 8

    Expected output:
    25
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter how many numbers you want me to calculate");
        int endpoint = input.nextInt();

        int sum = 0;

        for (int i = 1; i <= endpoint; i++) {
            System.out.println("Please enter number " + i);
            int number = input.nextInt();

            sum += number;
        }

        System.out.println("Sum of the numbers given by user is = " + sum);
    }
}
