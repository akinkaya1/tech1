package casting.practice;

public class Example3 {
    public static void main(String[] args) {
        /*
        store your favorite number in an int primitive data type
        also store your age in the byte primitive data type
        convert those values to strings
         */

        int favoriteNumber = 7;
        byte age = 29;

        /*
        String favNum = favoriteNumber + "";
        String myAge = age + "";
         */

        String favNum = String.valueOf(favoriteNumber);
        String myAge = String.valueOf(age);
    }
}
