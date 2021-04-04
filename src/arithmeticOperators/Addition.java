package arithmeticOperators;

public class Addition {
    public static void main(String[] args) {
        /*
        PSEUDO CODE
        -Create 2 int variables and assign 3 and 5 to those
        -Find the sum of those variables and print
        -Expected result= Sum is: 8
         */

        int number1 = 3;
        int number2 = 5;

        int sum = number1 + number2;

        System.out.println("Sum is: " + sum);

        /*
        PSEUDO CODE
        -Create 3 int variables and assign 10, 20 and 50 to those
        -Find the sum of those variables and print
        -Expected result= Sum is: 80
         */

        int value1 = 10, value2 = 20, value3 = 50, sumOfValues = value1+value2+value3;

        System.out.println("Sum of values is: " + sumOfValues);

    }
}
