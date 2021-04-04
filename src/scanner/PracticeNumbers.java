package scanner;

import java.util.Scanner;

public class PracticeNumbers {
    public static void main(String[] args) {

        int age;  //int can store int, short, byte

        Scanner scan = new Scanner(System.in);
        System.out.println("Please tell me your age: ");
        age = scan.nextInt(); // twenty eight

        System.out.println("The age is: " + age);
    }
}
