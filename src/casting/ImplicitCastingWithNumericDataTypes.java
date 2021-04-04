package casting;

public class ImplicitCastingWithNumericDataTypes {
    public static void main(String[] args) {
        //casting from byte to short
        //dataType variableName = value;


        byte b1 = 125;
        short s1 = b1;  //Implicit casting of byte into short

        //casting from short to int

        short s2 = 1200;
        int i1 = s2; // Implicit casting of short into int

        //casting from int to long
        int i2 = 1400;
        long l1 = i2; // Implicit casting of int into long

        //Casting from byte to long
        long l2 = b1; //Implicit casting of byte into long
    }
}
