package ifElseStatements.ifStatement;

import java.util.Scanner;

public class RetiredProgram {
    /*
    Write a Java program that asks user to enter their age
    And print “It is your time to get retired!” if their age is more than or equal to 55!

    PSEUDO CODE
    1.Create a scanner
    2.Ask user to enter the age
    3.Store data in proper data type
    4.Check if age is equal or greater than 55 and print statement if condition is true
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = input.nextInt();

        if(age >= 55){
            System.out.println("It is your time to get retired!");
        }
    }
}