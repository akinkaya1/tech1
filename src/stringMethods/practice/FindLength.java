package stringMethods.practice;

import java.util.Scanner;

public class FindLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your favorite book and the quote");
        String favBook = input.nextLine();
        String favQuote = input.nextLine();

        System.out.println("The length for the name of the book: " + favBook.length());
        System.out.println("The length for the favorite quote: " + favQuote.length());
    }
}
