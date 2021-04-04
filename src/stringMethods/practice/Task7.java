package stringMethods.practice;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = scan.nextLine().trim().toUpperCase();

        if(sentence.contains("$")) System.out.println("It contains $ sign\nThe index of $ sign is " + sentence.indexOf('$'));
        else System.out.println("It does not contain $ sign");

    }
}
