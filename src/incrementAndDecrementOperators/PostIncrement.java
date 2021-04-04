package incrementAndDecrementOperators;

public class PostIncrement {
    public static void main(String[] args) {
        int number1 = 50;

        int number2 = number1++;

        System.out.println("Number 1: " + number1); // 51
        System.out.println("Number 2: " + number2); // 50

        int age;
        int number = 5;

        System.out.println("The number is: " + number);

        //age = 10 * (number++); // increase it but do not assign

        age = 10 * number;

        number = number + 1; // number++;

        System.out.println("Age is " + age);

        System.out.println("The number is: " + number);


    }
}
