package arithmeticOperators.shortHandAssignments;

public class Example1 {
    /*
    find their sum, subtraction, multiplication, division and remainder by using shorthand operators,
    and assign those values into a.
     */
    public static void main(String[] args) {
        int a = 8;  int b = 3;

        //find the sum
        System.out.println("Sum is: " + (a += b)); // 11

        //subtraction
        a = 8;
        System.out.println("Subtraction is: " + (a -= b)); // 5

        //multiplication
        a = 8;
        System.out.println("Multiplication is: " + (a *= b)); // 24

        //division
        a = 8;
        System.out.println("Division is: " + (a /= b)); // 2

        //remainder
        a = 8;
        System.out.println("Remainder is: " + (a %= b)); // 2
    }
}
