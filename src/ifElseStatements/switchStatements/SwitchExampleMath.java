package ifElseStatements.switchStatements;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class SwitchExampleMath {
    /*
    Write a Java program that asks user to enter 2 numbers first
    Then ask user to select one of the option below
	1.Addition
	2.Subtraction
	3. Multiplication
	4.Division
    Finally, do the math calculation for given 2 numbers and selected option.

    Test data:
    Number1 = 20
    Number2 = 5
    Option = 4

    Expected output:
    20 / 5 = 4

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number:");
        double number1 = scan.nextInt();

        System.out.println("Please enter second number:");
        double number2 = scan.nextInt();

        System.out.println("Enter one of the option below\n" +
                "\t1.Addition\n" +
                "\t2.Subtraction\n" +
                "\t3.Multiplication\n" +
                "\t4.Division\n");

        int option = scan.nextInt(); // byte or short would also work

        switch (option){
            case 1:
                System.out.println(number1 + number2);
                break;
            case 2:
                double subtraction = number1 > number2 ? number1 - number2 : number2 - number1;
                System.out.println(subtraction);
                break;
            case 3:
                System.out.println(number1 * number2);
                break;
            case 4:
                System.out.println(number1 / number2);
                break;
            default:
                System.out.println("The option you entered is not valid");
        }
    }
}
