package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Numbers {
    public static void main(String[] args) {

        //How to put an array inside the arrayList
        //put all the numbers starting from 1 to 10

        Integer[] nums = {10, 2, 6, 4, 5, 3, 7, 8, 9, 1};

        ArrayList<Integer> numsToList = new ArrayList<>(Arrays.asList(nums));
        Collections.sort(numsToList);
        System.out.println(numsToList);

        // how many numbers are even
        int count = 0;

        for (int i = 0; i < numsToList.size(); i++) {
            if(numsToList.get(i) % 2 == 0) count++;
        }

        System.out.println("Even numbers count is = " + count);
    }
}
