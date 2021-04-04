package relationalOperators;

public class FirstPractice {
    public static void main(String[] args) {

        boolean b1 = 5 < 5;
        boolean b2 = 10 != 10;
        boolean b3 = 10 <= 10;

        System.out.println(b1); //false
        System.out.println(b2); //false
        System.out.println(b3); //true


        double balance = 100;

        System.out.println(balance < 0); //false

        balance -= 150;

        System.out.println(balance < 0); // true
    }
}
