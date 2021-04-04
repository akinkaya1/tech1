package scanner;

import java.util.Scanner;

public class AverageOfNumbers {
    /*
    Write a program that asks user to enter 5 numbers and print average of those numbers
    EX/ numbers are: 1,2,3,4,8
    Result = 3.6
     */
    public static void main(String[] args) {
        double number1, number2, number3, number4, number5, average;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 5 numbers: ");
        number1 = scan.nextDouble();
        number2 = scan.nextDouble();
        number3 = scan.nextDouble();
        number4 = scan.nextDouble();
        number5 = scan.nextDouble();

        average = (number1 + number2 + number3 + number4 + number5)/5;

        System.out.println("The average of those 5 numbers is: " + average);

    }
}
