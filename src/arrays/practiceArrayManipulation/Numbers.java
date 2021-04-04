package arrays.practiceArrayManipulation;

import java.util.Arrays;

public class Numbers {
    public static void main(String[] args) {
        /**
         TASK-1
         Create a new array of int
         Store 12, -34, 0, 25, 67, 109, 0
         Print all numbers
         12
         -34
         0
         25
         67
         109
         0
         */

        System.out.println(">>>>>>>>>>>>>>TASK-1 with Fori Loop<<<<<<<<<<<<<<<");
        System.out.println();

        int[] numbers = {12, -34, 0, 25, 67, 109 , 0};

        for (int i = 0; i <= numbers.length-1; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println(">>>>>>>>>>>>>>TASK-1 with For Each Loop<<<<<<<<<<<<<<<");
        System.out.println();


        //For each element in the numbers array, run the code inside curly braces
        //It takes elements from numbers array one by one and prints those elements
        for (int element: numbers) {
            System.out.println(element);
        }


        /**
         TASK-2
         Use above int array
         Print the positive numbers
         USE FOR EACH LOOP
         12
         25
         67
         109
         */

        System.out.println();
        System.out.println(">>>>>>>>>>>>>>TASK-2<<<<<<<<<<<<<<<");
        System.out.println();

        for(int element: numbers){
            if(element > 0) System.out.println(element);
        }

        /**
         TASK-3
         Use above int array
         Print the negative numbers
         USE FOR EACH LOOP
         -34
         */

        System.out.println();
        System.out.println(">>>>>>>>>>>>>>TASK-3<<<<<<<<<<<<<<<");
        System.out.println();

        for(int element: numbers){
            if(element < 0) System.out.println(element);
        }

        /**
         TASK-4
         Use above int array
         Find how many zeros you have in this array
         USE FOR EACH LOOP
         Result = 2
         */

        System.out.println();
        System.out.println(">>>>>>>>>>>>>>TASK-4<<<<<<<<<<<<<<<");
        System.out.println();

        int counter = 0;
        for(int element: numbers){
            if(element == 0) {
                counter++;
            }
        }

        System.out.println("There are " + counter + " zeros in this array");

        System.out.println();
        System.out.println(">>>>>>>>>>>>>>Second big<<<<<<<<<<<<<<<");
        System.out.println();

        int size = numbers.length;
        Arrays.sort(numbers);
        System.out.println("sorted Array ::"+Arrays.toString(numbers));
        int res = numbers[size-2];
        System.out.println("2nd largest element is ::"+res);
    }
}
