package arrays.practiceArrayManipulation;

import java.util.Arrays;

public class SortingArrays {

    public static void main(String[] args) {
        double[] balances = {25.6, 34.5, 0, -12, 100.65};

        System.out.println("Before sorting " + Arrays.toString(balances));
        /*
        Find min and max balances
        min = -12
        max = 100.65
         */

        Arrays.sort(balances); // [-12, 0, 25.6, 34.5, 100.65]

        System.out.println("After sorting " + Arrays.toString(balances));

        System.out.println("The smallest element in array is: " + balances[0]); //min
        System.out.println("The greatest element in array is: " + balances[balances.length-1]); //max

        String[] names = {"alex", "ally", "Mariia", "Kaan"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        char[] characters = {'A', 'Z', 'g', 'b', '%', ' ', '6', '4'};

        Arrays.sort(characters);

        System.out.println("Sorted char array = " + Arrays.toString(characters));
    }
}
