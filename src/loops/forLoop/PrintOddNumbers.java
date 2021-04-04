package loops.forLoop;

import java.util.Scanner;

public class PrintOddNumbers {
    public static void main(String[] args) {
        /**
         Write a Java program to ask user to enter a number and print all the odd numbers starting from 0 to given number by user (0 and given number is included)

         Test data:
         15

         Expected output:
         1
         3
         5
         .
         .
         .
         13
         15
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = input.nextInt();

        for (int i = 0; i <= num; i++) {
            if(i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
