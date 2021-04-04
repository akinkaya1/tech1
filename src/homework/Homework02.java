package homework;

import java.math.BigInteger;
import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        /*
        Homework02 TASK4
        Write a Java program that asks user to enter a number as input and print
        its multiplication table up to 5000000.
        Test Data:
        5
                */
        System.out.println("Homework02 TASK 4");
        System.out.println();
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter a number");
        int value = input.nextInt();
        int number = 1;

        System.out.println();
        System.out.println("Result is: " + value * number++); //1
        System.out.println("Result is: " + value * number++);
        System.out.println("Result is: " + value * number++);
        System.out.println("Result is: " + value * number++);
        System.out.println("Result is: " + value * number++);
        System.out.println("Result is: " + value * number++);
        System.out.println("Result is: " + value * number++);
        System.out.println("Result is: " + value * number++);
        System.out.println("Result is: " + value * number++);
        System.out.println("Result is: " + value * number++); //10
        System.out.println();

        System.out.println(Integer.MAX_VALUE);

    }
}
