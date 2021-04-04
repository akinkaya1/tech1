package stringMethods.practice;

public class Task1 {
    /*
    Requirement:
    Assume that you are given a String as below;
    String str = ”SDLC is step by step procedure to create an application”;
    Write a program to find the length of the given String -> length() method could be use for this
    and the indexes of “SDLC” and “application” words -> indexOf(String)
     */

    public static void main(String[] args) {
        String str = "SDLC is step by step procedure to create an application";
        int lengthOfStr = str.length(); // 55

        int indexOfSDLC = str.indexOf("SDLC"); // 0

        int indexOfApplication = str.indexOf("application"); // 44

        System.out.println("The length of given string is = " + lengthOfStr);
        System.out.println("The index of \"SDLC\" is = " + indexOfSDLC);
        System.out.println("The index of \"application\" is = " + indexOfApplication);

    }
}
