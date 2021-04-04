package casting;

public class ConvertingToStringUsingValueOf {
    public static void main(String[] args) {

        float balance = 5000.8f;

        String stringBalance = String.valueOf(balance); //String object

        int num = 15;

        String s = String.valueOf(num); // 15 string

        System.out.println(num + num);//30
        System.out.println(s + s);//1515

        int newNum = Integer.valueOf(s);
        System.out.println(newNum * newNum); // 15 * 15 = 225
    }
}
