package loops.whileLoop;

import java.util.Random;
import java.util.Scanner;

public class UnderstandingWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number bt 1 to 10");
        int num = scan.nextInt();

        int attempts = 0;

        boolean isGameGoing = true;

        while(isGameGoing){
            Random random = new Random();
            int randomNumber = random.nextInt(10)+1; //3
            attempts++;
            if(num == randomNumber){
                isGameGoing = false;
                System.out.println("The attempts: " + attempts);
                System.out.println("Game over");
            }
            else{
                System.out.println("Number is not equal to that random number: " + randomNumber);
            }
        }




    }
}
