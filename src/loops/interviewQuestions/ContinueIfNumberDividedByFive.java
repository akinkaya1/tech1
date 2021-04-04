package loops.interviewQuestions;

import java.util.Random;

public class ContinueIfNumberDividedByFive {
    public static void main(String[] args) {

        Random numberGenerator = new Random();

        int firstNumber = numberGenerator.nextInt(26); // 0-25
        int secondNumber = numberGenerator.nextInt(26); // 0-25

        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);

        int greatest = Math.max(firstNumber, secondNumber);
        int smallest = Math.min(firstNumber, secondNumber);


        for(int i = smallest; i <= greatest; i++){
            if(i % 5 == 0) continue;
            System.out.println(i);
        }
    }
}
