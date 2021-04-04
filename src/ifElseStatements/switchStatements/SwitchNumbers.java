package ifElseStatements.switchStatements;

import java.util.Scanner;

public class SwitchNumbers {
    /*
    Write a Java program that asks user to enter a number from 1 to 5 (1 and 5 are included)
    Based on the selection print the result
    Use switch statement to solve the problem
    Print “Number entered is not in the range” if user enters any other number
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 5 (1 and 5 are included)");
        int number = scan.nextInt();

        switch(number){
            case 1:
                System.out.println("User entered 1");
                break;
            case 2:
                System.out.println("User entered 2");
                break;
            case 3:
                System.out.println("User entered 3");
                break;
            case 4:
                System.out.println("User entered 4");
                break;
            case 5:
                System.out.println("User entered 5");
                break;
            default:
                System.out.println("Number entered is not in the range");
        }

        if(number == 1){
            System.out.println("User entered 1");
        }
        else if(number == 2){
            System.out.println("User entered 2");
        }
        else if(number == 3){
            System.out.println("User entered 3");
        }
        else if(number == 4){
            System.out.println("User entered 4");
        }
        else if(number == 5){
            System.out.println("User entered 5");
        }
        else{
            System.out.println("Number entered is not in the range");
        }
    }
}
