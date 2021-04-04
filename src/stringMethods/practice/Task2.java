package stringMethods.practice;

public class Task2 {
    /*
    Requirement:Assume that you are given a String as below;
    String str = “   I know how to code with Python   ”;
    Write a program to manipulate given String and convert it to be:
    “I KNOW HOW TO CODE WITH JAVA”

    PSEUDO CODE
    1. get rid of those spaces
    2. do the replacement
     */
    public static void main(String[] args) {
        String str = "   I know how to code with Python   ";

        String strNew = str.trim().toUpperCase().replace("PYTHON", "JAVA");

        System.out.println(strNew);
    }
}
