package loops.doWhileLoop;

import java.util.Scanner;

public class Practice2 {
    /**
     Write a Java program that asks user to enter a number
     if number is dividable by 5 then finish the program
     but if number is not dividable by 5,
     keep asking user to enter a new number until user enters a number that is dividable by 5

     Example program
     Program: Please enter a number
     User: 3
     Program: This number is not dividable by 5

     Program: Please enter a new number
     User: 10
     Program: This number is dividable by 5

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        do{
            System.out.println("Enter a number");
            num = input.nextInt();
        }
        while(num % 5 != 0);

        System.out.println("The number you entered is " + num);
        System.out.println("GAME OVER!!!");
    }
}
