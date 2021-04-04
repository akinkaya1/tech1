package casting;

public class ExplicitCasting {
    public static void main(String[] args) {
        int number1 = 100;
        System.out.println("int value: " + number1); //100

        byte b1 = (byte) number1;
        System.out.println("byte value: " + b1); //100

        short s1 = (short) number1;
        System.out.println("short value: " + s1); //100

        double  balance = 5000;
        float f = (float) balance;
    }
}
