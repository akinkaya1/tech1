package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {

        //Manual method - do not use method - loops

        ArrayList<String> cookies = new ArrayList<>();
        cookies.add("Oat meal cookies");
        cookies.add("Chocolate cookies");
        cookies.add("Peanut cookies");


        System.out.println("ArrayList = " + cookies);
        
        String[] cookiesArray = new String[cookies.size()];

        for (int i = 0; i < cookies.size(); i++) {
            cookiesArray[i] = cookies.get(i);
        }

        System.out.println("Array 1 = " + Arrays.toString(cookiesArray));

        //Using method

        Object[] cookiesArray2 = cookies.toArray();

        System.out.println("Array 2 = " + Arrays.toString(cookiesArray2));
    }
}
