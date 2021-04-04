package oop.methods.returnMethods;

public class Calculator {

    public int add(int a, int b){
        return a + b;
    }

    //Overloaded add method
    public int add(byte a, byte b){
        return a + b;
    }

    //Overloaded add method
    public int add(short a, short b){
        return a + b;
    }

    //Overloaded add method
    public double add(double a, double b){
        return a + b;
    }

    /*
    Write a new method that takes 3 integers and returns sum of those 3 integers
     */

    //Overloaded add method
    public int add(int a, int b, int c){
        return a + b + c;
    }

    /*
        findDifference
        Create a method that takes 2 integers
        And it returns their difference - variance
     */

    public int findDifference(int a, int b){
        return Math.max(a, b) - Math.min(a, b);
    }

    /*
    Write a method that takes a number
    And returns the square of that number // number * number
     */

    public int findSquare(int number){
        return number * number;
    }



    /*
    Write a method that takes 2 parameters
    One of the parameters is an int array
    The other is an int number
    Return how many occurrences of number is in int array

    int[] numbers = {1,4,7,4,9,4,1};
    int number = 4;

    Result: 3
     */

    public int countNumberInAnArray(int[] numbers, int number){
        int count = 0;

        for (int element: numbers) {
            if(element == number) count++;
        }
        return count;
    }

    /*
    Write a method that takes an integer array
    And returns sum of all elements in the array - int
    Method name findSumOfNumbersInAnArray
     */

    public int findSumOfNumbersInAnArray(int[] numbers){
        int sum = 0;

        for(int element: numbers){
            sum += element;
        }
        return sum;
    }
}
