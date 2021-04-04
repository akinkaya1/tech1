package loops.whileLoop;

import java.util.Random;

public class UnderstandingRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10)+1;

        System.out.println(randomNumber);

        if(randomNumber % 2 == 0) System.out.println("EVEN");
        else System.out.println("ODD");
    }
}
