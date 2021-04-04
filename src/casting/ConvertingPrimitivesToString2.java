package casting;

public class ConvertingPrimitivesToString2 {
    public static void main(String[] args) {
        char c = 'A';

        String s = c + "";
        System.out.println(s);

        double d = 124;

        String str = d + "";

        double adapterPrice = 18.99; // 18.99
        System.out.println("Double of adapter price" + adapterPrice);

        String expectedLookOfPrice = "$" + adapterPrice; //$18.99
        System.out.println("String value of adapter price" + expectedLookOfPrice);
    }
}
