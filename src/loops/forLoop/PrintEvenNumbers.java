package loops.forLoop;

public class PrintEvenNumbers {
    /*
    Write a Java program to print only even numbers from 1 to 10 (0 and 10 are included)
    0
    2
    4
    6
    8
    10
     */

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            if(i % 2 == 0) System.out.println(i);
        }
    }
}
