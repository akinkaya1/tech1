package arrays.twoDimensionalArray;

import java.util.Arrays;

public class UnderstandingTwoDimensionalArrays {
    public static void main(String[] args) {

        int[][] numbers = new int[3][2];

        numbers[0][0] = 5;
        numbers[2][0] = 7;
        numbers[1][1] = 1;

        System.out.println(Arrays.deepToString(numbers));

        String[][] groups = {{"Mariia", "Kaan"}, {"Dajve", "Volkan", "Bahar", "Murat"}};

        System.out.println(Arrays.deepToString(groups));

        System.out.println(groups[1][1]);

        for (int i = 0; i < groups.length; i++) {
            for (int j = 0; j < groups[i].length; j++) {
                System.out.println(groups[i][j]);
            }
        }
    }
}
