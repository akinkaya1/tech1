package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class UnderstandingArrayList {
    public static void main(String[] args) {

        //Java, Ruby, C#, JavaScript
        String[] languages = new String[4]; // We must state the size, otherwise compiler error will be there
        languages[0] = "Java";
        languages[1] = "Ruby"; // "", null
        languages[2] = "C#";
        languages[3] = "JavaScript";

        System.out.println("Languages array = " + Arrays.toString(languages)); // printing array
        System.out.println("First element in array is = " + languages[0]); // printing first element in array
        System.out.println("The size of array = " + languages.length); // printing the size of array


        System.out.println("\n <<<<<<<< Comparing Array with ArrayList >>>>>>>> \n");
        ArrayList<String> languagesList = new ArrayList<>(); // don't have fixed size
        languagesList.add("Java");
        languagesList.add("Ruby");
        languagesList.add("C#");
        languagesList.add("JavaScript");


        System.out.println("Languages arrayList = " + languagesList); // printing ArrayList
        System.out.println("First element in arrayList is = " + languagesList.get(0)); // printing first element in arrayList
        System.out.println("The size of arrayList = " + languagesList.size()); // printing the size of arrayList
    }
}
