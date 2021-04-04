package oop.methods.voidMethods;

import java.util.Arrays;

public class Printer {

    public void printName(String name){
        System.out.println(name.toLowerCase());
    }

    public void printHello(){
        System.out.println("Hello");
    }

    /*
    Create a method called printAge
    Define a parameter int age in it
    print out given age inside the method
     */

    public void printAge(int age){
        System.out.println("Age is " + age);
    }


    /*
    Create method called add
    This method will take 2 int parameters
    And it will prints the sum of those 2 numbers
     */

    public void add(int a, int b){
        System.out.println("The sum of those 2 numbers is: " + (a+b));
    }

    /*
    findGreatest
    Create a method that takes 2 int parameters
    And it prints the greatest of those numbers
    if numbers are equal, those numbers are equal
     */

    public void findGreatest(int a, int b){
        if(a == b){
            System.out.println(a + " is same as " + b);
        }
        else{
            System.out.println(Math.max(a, b) + " is the greatest");
        }
    }

    public void findSmallest(int a, int b){
        if(a == b){
            System.out.println(a + " is same as " + b);
        }
        else{
            System.out.println(Math.min(a, b) + " is the greatest");
        }
    }

    /*
    Write a method that takes a String and prints reserved string

     */

    public void reverseAndPrintString(String str){
        String reversed = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed string is: " + reversed);
    }

    /*
    Write a method that takes 1 int and prints the multiplication table of the number until 10
    Method name = printMultiplicationTable()

    Multiplication result with 1 = 6
    Multiplication result with 2 = 12
    Multiplication result with 3 = 18
    .
    .
    .
    Multiplication result with 10 = 60
     */

    public void printMultiplicationTable(int number){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Multiplication result with " + i + " = " + number * i);
        }
    }

    /*
    Create a method that is called findBiggestFromArrayAndPrintIt()
    This method will take an int array as parameter
     */

    public void findBiggestFromArrayAndPrintIt(int[] numbers){
        if(numbers.length > 0){
            //I will find the greatest and print it 100, 100, 2, 5, 67, 89 // index of 5 = numbers.length - 1

            int greatest = numbers[0];

            for (int i = 1; i < numbers.length; i++) {
                if(numbers[i] > greatest) greatest = numbers[i];
            }
            System.out.println("The greatest is = " + greatest);
        }
        else{
            System.out.println("This array does not have any element");
        }
    }


}
