package scanner;

import java.util.Scanner;

public class MyFirstScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Creating a Scanner object

        System.out.println("Please enter your name: ");
        String name = input.next();

        System.out.println();

        System.out.println("Please enter your last name: ");
        String lastName = input.next();

        System.out.println();

        System.out.println("Please enter you email: ");
        String email = input.next();

        System.out.println();

        System.out.println("Please enter phone number: ");
        String phoneNumber = input.next();

        System.out.println();

        System.out.println("Please enter your message: ");
        String message = input.next();

        System.out.println("The result of the program");
        System.out.println("First name is: " + name);
        System.out.println("Last name is: " + lastName);
        System.out.println("Email is: " + email);
        System.out.println("Phone number is: " + phoneNumber);
        System.out.println("Message is: " + message);

    }
}
