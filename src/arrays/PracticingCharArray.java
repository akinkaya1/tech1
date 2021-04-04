package arrays;

public class PracticingCharArray {
    /**
     Create a char array, size of 4
     And store given characters in it: A, 3, %, +
     Finally print all those values
     */

    public static void main(String[] args) {
        char[] characters = new char[4];

        characters[0]= 'A';
        characters[1]= '3';
        characters[2]= '%';
        characters[3]= '+';

        System.out.println(characters[0]);
        System.out.println(characters[1]);
        System.out.println(characters[2]);
        System.out.println(characters[3]);
    }
}
