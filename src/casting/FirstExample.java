package casting;

public class FirstExample {
    public static void main(String[] args) {
        double balance = 60.99; // 60.0
        System.out.println(balance);

        int number = (int) balance;

        System.out.println(number);
    }
}
