package homework;

import java.util.Random;

public class HM9_Task1 {
    public static void main(String[] args) {


        //TASK 7
        int number = 13;

        boolean b = true;

        for (int i = 2; i < number ; i++) {
            if(number % i == 0) {
                System.out.println(number + " is not Prime");
                b = false;
                break;
            }
        }

        if(b) System.out.println(number + " is Prime");

    }
}
