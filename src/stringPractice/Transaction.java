package stringPractice;

public class Transaction {
    /*
    Alex has $125.00 in the morning
    Alex spends $12.45 for breakfast
    Alex spends $20.99 to buy a T-shirt
    Alex spends $23.25 for dinner

    Print Alex's balance after each transaction
     */
    public static void main(String[] args) {

        double balance = 125, breakfast = 12.45, tShirt = 20.99, dinner = 23.25;

        System.out.println("Alex's balance in the morning was = $" + balance); // $125.0

        //Alex spends $12.45 for breakfast

        balance = balance - breakfast; // $112.55

        System.out.println("Balance after the transaction for breakfast is = $" + balance);

        //Alex spends $20.99 to buy a T-shirt

        balance = balance - tShirt; // $91.56

        System.out.println("Balance after the transaction for T-shirt is = $" + balance);

        // Alex spends $23.25 for dinner

        balance = balance - dinner;
        System.out.println("Balance after the transaction for dinner is = $" + balance);
    }
}
