package loops.forLoop;

public class PrintingNumbersBackward {
    /*
    Write a Java program to print numbers backward starting from 100 to 0 (100 and 0 are included)
    100 - 99 - 98 ........... 3 - 2 - 1 - 0
     */
    public static void main(String[] args) {

        for (int i = 100; i >= 0 ; i--) {
            if(i != 0) System.out.print(i + " - ");
            else System.out.println(i);
        }
    }
}
