package stringMethods;

import java.util.Scanner;

public class EqualsMethodTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first string: ");
        String s1 = scan.nextLine(); // Java is fun

        System.out.println("Please enter second string: ");
        String s2 = scan.nextLine();

        if(s1.equals(s2)) System.out.println("Those strings are equal");
        else System.out.println("Those strings are not equal");

    }
}
