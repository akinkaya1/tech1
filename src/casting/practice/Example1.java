package casting.practice;

public class Example1 {
    public static void main(String[] args) {
        /*
        create a byte primitive data type
        store your age inside this variable
        then cast this age into short, int and long

        NOTE: This is a implicit kind of casting (widening, upcasting)
         */

        byte age = 29;
        short shortAge = age;
        int intAge = age; // it could also handle shortAge
        long longAge = age; // it could also handle shortAge, intAge

    }
}
