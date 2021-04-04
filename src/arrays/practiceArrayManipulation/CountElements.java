package arrays.practiceArrayManipulation;

public class CountElements {
    public static void main(String[] args) {
        /*
        Create an array that holds {-4, 0, 4, 34, -45}
        Find how many elements are negative
        Find how many elements are positive

        Solution:
        Negatives = 2
        Positives = 2
         */

        int[] numbers = {-4, 0, 4, 34, -45};

        int positives = 0, negatives = 0;

        for (int element: numbers) {
            if(element > 0) positives++;
            else if(element < 0) negatives++;
        }

        System.out.println("There are " + positives + " positive numbers");
        System.out.println("There are " + negatives + " negative numbers");


        /*
        Create an array that holds {"Chicago", "LA", "Miami", "Morton Grove", "madison"}
        How many cities starts with m letter

        Result:
        3
         */

        String[] cities = {"Chicago", "LA", "Miami", "Morton Grove", "madison"};

        int counter = 0;

        for (String element: cities) {
            if(element.toLowerCase().startsWith("m")) counter++;
        }

        System.out.println("There are " + counter + " cities starts with m");

    }
}
