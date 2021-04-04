package stringMethods.practice;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Task5 {
    /*
    Requirement:
    Write a program that asks user to enter their favorite color.
    Then, print the first and last characters of the color
    Also, print the first and last 3 characters of the color

    Test data:
    green

    Expected output:
    1st character is = g
    2nd character is = n
    First 3 characters are = gre
    Last 3 characters are = een
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your fav color");
        String myFavColor = scan.nextLine();

        System.out.println(myFavColor.charAt(0));
        System.out.println(myFavColor.charAt(myFavColor.length()-1));

        System.out.println(myFavColor.substring(0,3));
        System.out.println(myFavColor.substring(myFavColor.length()-3));


    }
}
