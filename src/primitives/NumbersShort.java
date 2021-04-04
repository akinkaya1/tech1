package primitives;

public class NumbersShort {
    public static void main(String[] args) {
        /*
        min value of short is -32768
        max value of short is 32767
        */

        System.out.println("Min value of short is: " + Short.MIN_VALUE);
        System.out.println("Max value of short is: " + Short.MAX_VALUE);

        byte number = 127;

        //byte number2 = 300; -> this will not compile

        //to be able to store the value of 300, I may use short, int, long

        short number3 = 300;
        System.out.println(number3 + " is a number that can be handled by short but not byte");
    }
}
