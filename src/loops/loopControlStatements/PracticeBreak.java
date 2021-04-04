package loops.loopControlStatements;

import java.util.Scanner;

public class PracticeBreak {
    /**
     * Write a Java program that asks user to enter 2 different integers
     Print all the numbers between given 2 integers starting from biggest to smallest (given numbers are included)
     HOWEVER, do not print any number less than 10
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter greatest number");
        int greatestNumber = input.nextInt();

        System.out.println("Please enter smallest number");
        int smallestNumber = input.nextInt();

        for (int i = greatestNumber; i >=  smallestNumber; i--) {
            System.out.println(i);
            if(i == 10) break;
        }
    }
}
