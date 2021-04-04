package stringMethods;

public class EqualsMethod {
    public static void main(String[] args) {
        /*
        This method is used to compare 2 strings
        And it will return true if both strings are equal
        And it will return false if strings are not equal
         */

        String str1 = "Lionel";
        String str2 = "Ronaldo";

        System.out.println(str1.equals(str2)); // false

        String s1 = "123$@";
        String s2 = " 123$@";

        System.out.println(s1.equals(s2)); // false as there is space in s2

        String s3 = "Java";
        String s4 = "Java";

        System.out.println(s3.equals(s4)); // true
    }
}
