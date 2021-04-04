package stringMethods.practice;

import java.util.Locale;

public class Task3 {
    /*
    Requirement:
    Assume that you are given a String as below;
    String str = “     SDLC has planning, design, development, testing, deployment and maintenance phases    ”;
    1.Find the first character of given String which is not white space
    2.Find the last character of given String which is not white space


     */
    public static void main(String[] args) {
        String str = "     SDLC has planning, design, development, testing, deployment and maintenance phases    ";

        String strWithoutExtraSpaces = str.trim();

        System.out.println(strWithoutExtraSpaces.length());

        char charFirst = strWithoutExtraSpaces.charAt(0); // S
        char charLast = strWithoutExtraSpaces.charAt(strWithoutExtraSpaces.length()-1); // s

        System.out.println(charFirst);
        System.out.println(charLast);

    }
}
