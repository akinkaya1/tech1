package mutability;

public class Reverse {
    public static void main(String[] args) {
        String s = "Today is fun day"; // reverse
        System.out.println(reverseString(s));
    }


    //Create a method to reverse a given string and return that back

    public static String reverseString(String str){
        //1. convert string to StringBuilder or StringBuffer
        StringBuilder sb = new StringBuilder(str);

        //2. reverse StringBuilder or StringBuffer
        sb.reverse();

        return sb.toString();
    }
}
