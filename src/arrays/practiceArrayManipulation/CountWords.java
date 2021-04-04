package arrays.practiceArrayManipulation;

import java.util.Arrays;

public class CountWords {
    /*
    count how many reds you have in the String
    count how many blue you have in the String
     */

    public static void main(String[] args) {
        String color = " blue yellow BLUE red red ";

        String[] colorArray = color.trim().split(" ");

        System.out.println(Arrays.toString(colorArray));

        int countBlue = 0;
        int countRed = 0;

        for (String element: colorArray) {
            if(element.equalsIgnoreCase("blue")) countBlue++;
            else if(element.equalsIgnoreCase("red")) countRed++;
        }

        System.out.println("The count of blue is : " + countBlue);
        System.out.println("The count of red is : " + countRed);


        /*
        Count how many Alex String has
        Count how many Max String has

        Solution:
        Alex = 1
        Max = 2
         */

        String names = "Leo Max Max Alex Alexis";

        String[] namesArray = names.split(" ");

        int max = 0;
        int alex = 0;

        for (String name : namesArray) {
            if(name.equalsIgnoreCase("max"))  max++;
            else if(name.equalsIgnoreCase("alex")) alex++;
        }
        System.out.println("Amount of Max is " + max +
                "\nAmount of Alex is " + alex );

    }
}
