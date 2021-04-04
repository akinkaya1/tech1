package oop.methods;

import oop.methods.returnMethods.Calculator;
import oop.methods.voidMethods.Printer;

import java.util.Arrays;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        Printer myPrinter = new Printer();

        int sum = myCalculator.add(3, 5); // 8

        System.out.println("The result of method multiplied by 5 is " + sum * 5);

        System.out.println("The difference bt a and b is = " + myCalculator.findDifference(15, 20));

        System.out.println("The square of 5 is = " + myCalculator.findSquare(5));

        int[] numbers = {1, 4, 7, 4, 9, 4, 1}; // 30
        int number = 4;

        System.out.println("The occurrence of " +  number
                + " inside the "
                + Arrays.toString(numbers)
                + " is = " + myCalculator.countNumberInAnArray(numbers, number));

        int sumOfNumbers = myCalculator.findSumOfNumbersInAnArray(numbers);
        System.out.println("The sum of numbers in array is = " + sumOfNumbers);

        System.out.println("The sum of these two doubles is = " + myCalculator.add(5.6, 10));
    }
}
