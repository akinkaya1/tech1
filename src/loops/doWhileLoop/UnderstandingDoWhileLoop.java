package loops.doWhileLoop;

public class UnderstandingDoWhileLoop {
    public static void main(String[] args) {

        boolean isBaharAtSchoolToday = true;

        int i = 1;

        do{
            System.out.println(i);
            i++;
        }
        while(isBaharAtSchoolToday && i <= 10);

        System.out.println("End of the program");
    }
}
