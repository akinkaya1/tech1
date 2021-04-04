package scanner;

import java.util.Scanner;

public class Survey {

    /*
        Pepsi vs Coca Cola
        -Ask user their name and last name
        -Ask them which state they live in
        -Ask them which city they live in
        -Ask them if they want to add any information

        Use Scanner to run this program

        PSEUDO CODE
        1.create your variables to store upcoming data
            Variables = name, last name, state, city, and their additional message
        2.create a Scanner object
        3.do your survey
        4.store user inputs in your variables
        5.print all data
         */

    public static void main(String[] args) {

        String name, lastName, state, city, message;   //declaration of all values

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is your name: ");
        name = myScanner.next();   //assignment of name and name comes from user. Similar like name = "Lionel";

        System.out.println("What is your last name: ");
        lastName = myScanner.next();

        System.out.println("Which state do you live in: ");
        state = myScanner.next();

        System.out.println("Which city do you live in: ");
        city = myScanner.next();

        myScanner.nextLine();

        System.out.println("Do you want to add additional message: ");
        message = myScanner.nextLine();


        System.out.println("The result is here"
                + "\nName is: " + name
                + "\nLast name is: " + lastName
                + "\nState is: " + state
                + "\nCity is: " + city
                + "\nMessage is: " + message);
    }
}
