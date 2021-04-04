package loops.forLoop;

public class FindSumOfNumbers {
    /*
    Write a Java program to find sum of number from 10 to 15 ( 10 and 15 are included)

    Expected output:
    75
     */


    public static void main(String[] args) {

        int sum = 0;

        for (int i = 10; i < 16; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
