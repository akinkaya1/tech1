package loops.forLoop;

import java.util.Scanner;

public class PrintingCharacters2 {
    public static void main(String[] args) {
        /**
         Write a Java program that asks user to enter their names
         Print all the characters of the name in separate lines

         PSEUDO
         1.Create a Scanner Object
         2.Ask user to enter their names
         3.Store this name in a String
         4.Use loop to print each letter in the name
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scan.nextLine().trim(); // "  Lionel   " // "Lionel"

        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            System.out.println(letter);
        }

        System.out.println("Please enter your last name: ");
        String lastName = scan.nextLine().trim();

        for(int i = lastName.length()-1; i >= 0; i--){
            System.out.println(lastName.charAt(i));
        }

    }
}
