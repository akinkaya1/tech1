package ifElseStatements;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        /*
        Take 2 numbers
        Find their variance (difference)
        variable = expression1 ? Expression2 : expression3
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int number1 = scan.nextInt();

        System.out.println("Please enter second number: ");
        int number2 = scan.nextInt();

        int distance;

        /* instead of if else, ternary operator can be used
        if(number1 > number2){
            distance = number1 - number2;
        }
        else{
            distance = number2 - number1;
        }
        */

        distance = number1 > number2 ? number1 - number2 : number2 - number1;

        System.out.println("The distance is " + distance);
    }
}
