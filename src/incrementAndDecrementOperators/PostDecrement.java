package incrementAndDecrementOperators;

public class PostDecrement {

    public static void main(String[] args) {
        int number1 = 50;

        int number2 = number1--;

        System.out.println("Number 1: " + number1); // 49
        System.out.println("Number 2: " + number2); // 50
    }
}
