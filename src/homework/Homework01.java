package homework;

public class Homework01 {
    public static void main(String[] args) {
    /*
    Requirement:
    -Write a Java program to print the result of the following operations

    Test Data:
    1. 	-10 + 7 * 5  // 25
    2. 	(72+24) % 24  // 0
    3. 	10 + -3*9 / 9 // 7
    4. 	5 + 18 / 3 * 3 - 6 % 3 // 23

    Expected Output:
    1.	25
    2. 	0
    3. 	7
    4. 	23
     */

        System.out.println("The result of first part: " + (-10 + 7 * 5));
        System.out.println("The result for second is :" + ((72+24) % 24));
        System.out.println("The result for third is :" + (10 + -3*9 / 9));
        System.out.println("The result for fourth is :" + (5 + 18 / 3 * 3 - 6 % 3));
    }
}
