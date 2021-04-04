package incrementAndDecrementOperators;

public class PostIncrementExample {
    public static void main(String[] args) {

        int number1 = 5;

        int number2 = number1++; // increase number1 by 1 but do not assign

        int number3 = number1++;

        System.out.println("Number 1 is: " + number1); // 7
        System.out.println("Number 2 is: " + number2); // 5
        System.out.println("Number 3 is: " + number3); // 6
    }
}
