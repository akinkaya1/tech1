package casting.practice;

public class Example2 {
    public static void main(String[] args) {
        /*
        create a float primitive data type
        store your balance which is 100.55 into that variable
        then cast this into double, int and short
         */

        float  balance = 100.55f;

        double balanceDouble = balance; //implicit cast

        int balanceInt = (int) balance; //explicit cast

        short balanceShort = (short) balance; //explicit cast
    }
}
