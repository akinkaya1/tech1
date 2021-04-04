package variables;

public class DeclaringMultipleVariables {
    /*
    Java allows to declare and initialize multiple variables in the same statement
    int age1, age2;
    byte number1 = 10, number2 = 20, number3 = 50;
    Many variables can be declared in the same statement if they are all same type
    int num1, num2, num3 = 45, num4, num5;
     */

    public static void main(String[] args) {
        int age1, age2;
        byte number1 = 10, number2 = 20, number3 = 50;

        byte b1, b2 = 30, b3, b4 = 67;

        int i1 = 45, i2;

        //double d1, double d2; // this will not compile

        double d4; int age;
    }
}
