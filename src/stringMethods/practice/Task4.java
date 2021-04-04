package stringMethods.practice;

public class Task4 {
    /*
    Requirement:
    Assume you are given 3 Strings as below;
    String s1 = “   TECH  ”;
    String s2 = “  glo   ”;
    String s3 = “  BAL        “;

    Write a program that manipulates these 3 Strings and stores them in a new String s4
    And s4 will get value of “TechGlobal”
    Note: The length of s4 will be 10 at the end!!!
     */

    public static void main(String[] args) {
        String s1 = "   TECH  ";
        String s2 = "  glo   ";
        String s3 = "  BAL    ";

        String s4 = (s1 + s2 + s3).replace(" ", "").toLowerCase()
                .replace('t', 'T')
                .replace('g', 'G');

        System.out.println("First way " + s4);

        String s5 = (s1.trim() + s2.trim() + s3.trim()).toLowerCase()
                .replace('t', 'T')
                .replace('g', 'G');

        System.out.println("Second way " + s5);


    }
}
