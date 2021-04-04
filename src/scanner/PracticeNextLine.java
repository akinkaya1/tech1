package scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PracticeNextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a message: ");
        String message = input.nextLine();

        System.out.println("Please enter your favorite quote: ");
        String myQuote = input.nextLine();


        System.out.println();
        System.out.println("Message entered by user is: " + message);
        System.out.println("My quote is: " + myQuote);

    }
}
