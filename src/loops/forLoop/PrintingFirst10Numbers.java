package loops.forLoop;

public class PrintingFirst10Numbers {
    public static void main(String[] args) {
        /*
        Write a Java program to print numbers from 1 to 10 (1 and 10 are included)
        1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10
         */

        for(int i = 1; i <= 10; i++){
            if(i == 10) System.out.println(i);
            else System.out.print(i + " - ");
        }

    }
}
