package stringMethods;

import java.util.Scanner;

public class EqualsIgnoreCaseMethod {
    public static void main(String[] args) {
        /*
        ask user to enter 2 strings
        and check if they are equal or not
        ignore lower or capital cases
        if they are equal print message "Those are equal"
        if they are not equal print message "Those are not equal"
         */
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter a string");
        String str1 = input.nextLine();
        System.out.println("Enter another string");
        String str2 = input.nextLine();

        if(str1.equalsIgnoreCase(str2)) System.out.println("Those strings are equal");
        else System.out.println("Those strings are not equal");

    }
}
