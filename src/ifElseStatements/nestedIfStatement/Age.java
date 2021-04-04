package ifElseStatements.nestedIfStatement;

import java.util.Scanner;

public class Age {
    /*
    ask user to enter their age
    if their age is more than 18, then print "You are an adult"
    if their age is more than 55, then print "You are old"
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = input.nextInt();

        if(age > 18){
            System.out.println("You are an adult");
            if(age > 55){
                System.out.println("You are old");
            }
        }

        System.out.println("End of the program");
    }
}
