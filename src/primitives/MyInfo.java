package primitives;

public class MyInfo {
    /*
        -Create new class under primitives package called as MyInfo
        -Create different variables to store your information like
	    myAge, myDateOfYear, myFavoriteNumber, myFavoriteCharacter

        -Please make sure that you selected proper dataType (primitive) for your variables
        -Assign (put) values inside those variables
        Example:
        int myAge = 28;

        -Finally print out all those information with proper expressions by using println() method
        -NOTE: Make sure that you are reading your data from variables
        -Please use only 1 statement but print all information in separate lines
        Example:
        My age is 28
        My date of year is 1993
        .
        .
        .
     */

    public static void main(String[] args) {
        //I can store my age in byte, short, int, long

        int myAge = 28;

        //I can store my year for the date of birth short, int, long

        int myDateOfYear = 1993;

        //I can store my favorite number in byte, short, int or long depending on its capacity

        int myFavoriteNumber = 5;

        //I can store my favorite character in char data type

        char myFavoriteCharacter = 'A';

        System.out.println("My age is: " + myAge
                + "\nMy date of year is: " + myDateOfYear
                + "\nMy favorite number is: " + myFavoriteNumber
                + "\nMy favorite character is: " + myFavoriteCharacter);

    }
}
