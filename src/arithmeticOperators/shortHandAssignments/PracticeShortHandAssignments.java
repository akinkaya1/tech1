package arithmeticOperators.shortHandAssignments;

public class PracticeShortHandAssignments {
    public static void main(String[] args) {
        int age = 25;

        //10 years later

        age += 10; // this statement is equal to age = 25 + 10;

        System.out.println("Age is equal to " + age);


        int number1 = 10; // 10 - 2

        number1 -= 2; // 8

        System.out.println("Number1 is: " + number1);

        int number2 = 5;

        number2 *= 6; // 30

        System.out.println("Number2 is: " + number2);

        int number3 = 18;

        number3 /= 3; // 6

        System.out.println("Number3 is: " + number3);

        int number4 = 20;
        int numberEight = 8;

        number4 %= numberEight; // 4

        System.out.println("Number4 is: " + number4);
    }
}
