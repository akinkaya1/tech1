package oop.methods;


import oop.methods.returnMethods.Calculator;
import oop.methods.voidMethods.Printer;


public class TestPrinter {
    public static void main(String[] args) {

        Printer myPrinter = new Printer();

        String name = "Dajve";

        myPrinter.printName(name); // Hello dajve

        myPrinter.printHello();

        int myAge = 45;
        myPrinter.printAge(myAge); // Age is 45


        myPrinter.add(25, 35);

        myPrinter.findGreatest(10, 15); // 15
        myPrinter.findSmallest(3,5); // 3
        myPrinter.findSmallest(3,3); // equal
        myPrinter.findGreatest(5,5); // equal

        myPrinter.reverseAndPrintString("Mariia"); // Reversed string is: aiiraM

        myPrinter.printMultiplicationTable(7);

        int[] numbers = {};
        myPrinter.findBiggestFromArrayAndPrintIt(numbers); //
    }
}
