package ifElseStatements.nestedIfStatement;

import java.util.Scanner;

public class Numbers {
    /*
    ask user to enter a number
    if number is more 50 then print "Number is more than 50"
    if number is between 100 and 150, then print "Number is between 100 and 150"
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");

        int number = input.nextInt();

        if(number > 50){
            System.out.println("The number entered " + number + " is more than 50");
            if(number > 100 && number < 150){
                System.out.println("The number entered " + number + " is in between 100 and 150");
            }
        }

        System.out.println("End of the program");
    }
}
