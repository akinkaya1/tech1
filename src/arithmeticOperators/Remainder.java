package arithmeticOperators;

public class Remainder {
    public static void main(String[] args) {
        /*
        PSEUDO CODE
        -Create 2 int variables and assign 18 and 4 to those
        -Find the remainder of 18 by 4
        -Expected result= Remainder is: 18/4 = 2
         */

        int num1 = 18, num2 = 4;

        System.out.println("Remainder of 18 by 4 is equal to: " + (num1 % num2));


        System.out.println(15 % 25); //Expected result is: 15

        System.out.println(20 % 20); //Expected result is: 0
    }
}
