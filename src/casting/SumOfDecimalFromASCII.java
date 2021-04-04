package casting;

import java.util.Scanner;

public class SumOfDecimalFromASCII {
    public static void main(String[] args) {
        /*
        ask user to enter their name
        print the sum of decimal value of each letter in the name
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scan.next(); // leo

        int sum = name.charAt(0) + name.charAt(1) + name.charAt(2);
        // name.charAt(0) = 'l'

        System.out.println(sum);
    }
}
