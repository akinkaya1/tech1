package scanner;

import java.util.Scanner;

public class SumOfNumbers2 {
    public static void main(String[] args) {
        int n1,n2,n3;

        Scanner numbers = new Scanner (System.in);

        System.out.println("What are your top 3 numbers?");
        n1 = numbers.nextInt();
        n2 = numbers.nextInt();
        n3 = numbers.nextInt();

        int n4 = n1 + n2 + n3;

        System.out.println("The total of those 3 numbers are: " + n4);
    }
}
