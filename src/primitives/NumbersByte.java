package primitives;

public class NumbersByte {
    /*
     write a statement that prints -> The age is 27
     use age variable in your statement
     it can store numbers from -128 to +127 including zero
     */

    public static void main(String[] args) {
        byte age = 45;
        System.out.println("The age is " + age); // The age is 45

        byte number = 0; // I can store '0' in a byte
        byte minNumber = (-128);


        byte min = Byte.MIN_VALUE; //-128
        byte max = Byte.MAX_VALUE; //127

        System.out.println("Min number that byte can store is: " + min);
        System.out.println("Max number that byte can store is: " + max);


    }
}
