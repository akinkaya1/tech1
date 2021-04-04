package scanner;


import java.util.Scanner;

public class Address {
    public static void main(String[] args) {

        String address; // 2860 S River Rd Suite 350, Des Plaines IL 60018

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your address: ");
        address = myScanner.nextLine();

        System.out.println("The address is entered: " + address);
    }
}
