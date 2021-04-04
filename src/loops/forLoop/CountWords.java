package loops.forLoop;

import java.util.Arrays;
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        /**
         Ask user to enter a shopping list of fruit
         Count how many times user entered apple

         Example1
         apple banana APPLE strawberry apple
         Expected count of apple = 3

         Example2
         apple grapes peach
         Expected count of apple = 1

         Example3
         banana
         There is no apple in the list

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please tell what you want?");
        String shoppingList = scan.nextLine().trim();

        String[] fruits = shoppingList.split(" ");

        System.out.println(Arrays.toString(fruits)); //[apple, banana, APPLE, strawberry, apple]

        int countApples = 0;

        for (String element: fruits) {
            if(element.equalsIgnoreCase("apple")) countApples++;
        }

        if(countApples > 0)System.out.println("The count of apples is: " + countApples);
        else System.out.println("There is no apple in the list");

    }
}
