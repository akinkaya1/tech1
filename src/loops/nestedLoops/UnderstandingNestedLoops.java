package loops.nestedLoops;

public class UnderstandingNestedLoops {
    public static void main(String[] args) {

        //Print all the numbers starting 1 till 5 (1 and 5 are included)
        //for each number above, print numbers starting from 1 till number itself
        for (int i = 1; i <= 5; i++) {
            System.out.println("Outer loop " + i);

            for (int j = 1; j <= i; j++) {
                System.out.println(j);
            }
        }
    }
}
