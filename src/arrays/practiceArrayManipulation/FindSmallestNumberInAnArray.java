package arrays.practiceArrayManipulation;

public class FindSmallestNumberInAnArray {
    public static void main(String[] args) {
        int[] numbers = {7, 15, 36, 57,-4};

        int smallest = numbers[0];

        for (int element: numbers) {
            if(element < smallest) smallest = element;
        }

        System.out.println(smallest);
    }
}
