package stringMethods;

import java.util.Locale;

public class StartsWithAndEndsWith {
    public static void main(String[] args) {
        String str = "Java is fun";

        boolean b1 = str.startsWith("Hello"); // false
        boolean b2 = str.startsWith("java"); // false  java is not equal to Java

        boolean b3 = str.endsWith("FUN"); // false
        boolean b4 = str.endsWith("Java is fun"); // true
        boolean b5 = str.startsWith("Java is fun"); // true
    }
}
