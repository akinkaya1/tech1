package logicalOperators;

public class OrOperator {
    public static void main(String[] args) {
        boolean b1 = false;
        boolean b2 = false;

        System.out.println(b1 || b2);

        boolean b3 = true;

        boolean b4 = (b1 || b2) && b3;

        System.out.println(b4);
    }
}
