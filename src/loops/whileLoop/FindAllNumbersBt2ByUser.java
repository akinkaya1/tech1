package loops.whileLoop;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FindAllNumbersBt2ByUser {
    /**
     Write a java program that asks user to enter 2 different numbers
     Print all the numbers bt these 2 numbers including numbers as well
     NOTE: numbers should always be printed from smallest to greatest

     For example
     First number = 10
     Second = 5

     Expected output:
     5 - 6 - 7 - 8 - 9 - 10
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = scan.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = scan.nextInt();


        int greatest;
        int smallest;

        if(num1 > num2){
            greatest = num1;
            smallest = num2;
        }
        else{
            greatest = num2;
            smallest = num1;
        }

        for (int i = smallest; i <= greatest; i++) {
            if(i != greatest) System.out.print(i + " - ");
            else System.out.print(i);
        }

    }


}
