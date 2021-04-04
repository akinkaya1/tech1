package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToArrayList {

    public static void main(String[] args) {

        //Conversion with Arrays.asList(Collection) method
        Integer[] numbers = {1, 2, 3, 4, 5}; // primitive type of element
        ArrayList<Integer> numbersAsList = new ArrayList<>(Arrays.asList(numbers));

        //Conversion without any method
        for (int i = 0; i < numbers.length; i++) {
            numbersAsList.add(numbers[i]);
        }

        //Conversion with Collections.addAll() method
        Collections.addAll(numbersAsList, numbers);

        System.out.println(numbersAsList);
    }
}
