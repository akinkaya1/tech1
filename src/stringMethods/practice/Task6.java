package stringMethods.practice;

import java.util.Scanner;

public class Task6 {
    /*
    Requirement:
    Write a program that asks user to enter a full sentence
    Then, convert all sentence to lower case and print the first and last words in the given sentence

    Test data:
    JavA is an object-oriented programming LanguAGE

    Expected output:
    1st word is = java
    2nd word is = language

    Test data:
    I love winter

    Expected output:
    1st word is = i
    2nd word is = winter
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = scan.nextLine().toLowerCase().trim();

        System.out.println("First word is = " + sentence.substring(0, sentence.indexOf(" ")));
        System.out.println("Last word is = " + sentence.substring(sentence.lastIndexOf(" ") + 1));

    }
}
