package primitives;

public class NumbersInt {
    public static void main(String[] args) {
        /*
        The min value of int variable can be -2147483648
        The max value of int variable can be 2147483647
         */

        int myBalance = 5000000; //5,000,000
        System.out.println("My balance is: " + myBalance); //My balance is 5000000
        System.out.println("Min value of int is: " + Integer.MIN_VALUE);
        System.out.println("Max value of int is: " + Integer.MAX_VALUE);

        long number = 2147483648L; // "L" is proper to use rather than "l" because it is more recognizable
    }
}
