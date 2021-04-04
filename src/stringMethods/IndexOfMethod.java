package stringMethods;

import java.util.Locale;

public class IndexOfMethod {
    public static void main(String[] args) {

        /*
        find the index of e, G and o in the given String
        and find which of these character comes first in this String
         */

        String str = "TechGlobal";

        int indexOfT = str.indexOf('T'); // 0
        int indexOfX = str.indexOf('g'); // -1

        int indexOfGlobal = str.indexOf("Global");
        System.out.println("The index of \"Global\" is " + indexOfGlobal); // 4

        System.out.println("The index of g " + indexOfX);

        System.out.println(indexOfT);

        int indexOfe = str.indexOf('e'); // 1
        int indexOfG = str.indexOf('G'); // 4
        int indexOfo =  str.indexOf('o'); // 6

        if(indexOfe < indexOfG && indexOfe < indexOfo){
            System.out.println("The first letter of those is: e");
        }
        else if(indexOfG < indexOfe && indexOfG < indexOfo){
            System.out.println("The first letter of those is: G");
        }
        else{
            System.out.println("The first letter of those is: o");
        }
    }
}
