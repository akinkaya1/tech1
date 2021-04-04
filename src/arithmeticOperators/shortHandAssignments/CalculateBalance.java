package arithmeticOperators.shortHandAssignments;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CalculateBalance {
    /*
    Exercise - Calculating Balance

    Write a Java program that asks user their balance and one day transaction.
    Subtract each transaction from balance and return new balance using shorthand operator
    Requirements:
    Use Scanner class to read input from user

    Test data:
    Balance = $100.00
    1st transaction = $25.75
    2nd transaction =  $12.50
    3rd transaction = $7.25

    Expected output:
    Balance after 1st transaction = $74.25
    Balance after 2nd transaction = $61.75
    Balance after 3rd transaction = $54.5

    PSEUDO CODE
    1. create a double variable to store balance
    2. create a Scanner to read data from user
    3. ask user transaction amounts respectively - one by one
    4. after each transaction, print the new balance

     */
    public static void main(String[] args) {

        double balance, firstTransaction, secondTransaction, thirdTransaction;

        //Ask balance
        System.out.println("Please enter your balance: ");

        Scanner scanner = new Scanner(System.in);

        balance = scanner.nextDouble();

        System.out.println("Balance is: $" + balance);

        //First transaction flow
        System.out.println("Please enter the first transaction: ");

        firstTransaction = scanner.nextDouble();

        System.out.println("Balance after the first transaction is: $" + (balance -= firstTransaction));

        //Second transaction flow
        System.out.println("Please enter the second transaction: ");

        secondTransaction = scanner.nextDouble();

        System.out.println("Balance after the second transaction is: $" + (balance -= secondTransaction));

        //Third transaction flow
        System.out.println("Please enter the third transaction: ");

        thirdTransaction = scanner.nextDouble();

        System.out.println("Balance after the third transaction is: $" + (balance -= thirdTransaction));
    }
}
