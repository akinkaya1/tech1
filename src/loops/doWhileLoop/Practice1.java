package loops.doWhileLoop;

import java.util.Scanner;

public class Practice1 {
    /**
     Write a Java program that asks user to enter a number
     if number is more than or equal to 10, then finish the program but if number is less than 10,
     keep asking user to enter a new number until user enters a number that is more than or equal to 10

     Example program
     Program: Please enter a number
     User: 3
     Program: This number is not more than or equal to 10

     Program: Please enter a new number
     User: 8
     Program: This number is not more than or equal to 10

     Program: Please enter a new number
     User: 15
     Program: This number is more than or equal to 10

     PSEUDO CODE for do while practice 1
     -Create a scanner object
     -Ask user to enter a number
     -Check the number if 10 or less or more
     -Ask user to enter numbers until user enters a number that is more than or equal to 10

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        do{
            System.out.println("Please enter a number");
            num = input.nextInt();
        }
        while(num < 10);

        System.out.println("The number you entered is: " + num);
        System.out.println("End of the program");
    }
}
