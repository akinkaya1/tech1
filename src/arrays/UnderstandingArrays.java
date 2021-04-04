package arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {

        // declaration of a String array
        int[] ages; // declaration of an int array
        char[] characters; //  declaration of a char array

        //NOT preferred ways of creating arrays
        String [] lastNames;
        String addresses [];

        //Giving a size to array
        String[] names = new String[3];
        names[0] = "Kaan";
        names[2] = "Mbappe";

        System.out.println(names[0]);
        System.out.println(names[2]);
        System.out.println(names[1]); //null
    }
}
