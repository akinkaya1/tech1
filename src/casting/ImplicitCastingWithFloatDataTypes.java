package casting;

public class ImplicitCastingWithFloatDataTypes {
    public static void main(String[] args) {
        int i1 = 25;
        long l1 = 2147483648L;

        System.out.println(Integer.MAX_VALUE);

        double d1 = i1;

        float f1 = i1;

        double d2 = f1;

        double d3 = l1;
    }
}
