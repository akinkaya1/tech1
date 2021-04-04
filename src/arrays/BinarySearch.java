package arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {10, 5, 8, 1, 0, 10, 9};

        Arrays.sort(nums); // 0, 1, 5, 8, 9, 10, 10

        System.out.println(Arrays.binarySearch(nums, 10));
    }
}
