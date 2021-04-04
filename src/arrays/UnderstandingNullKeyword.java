package arrays;

import java.util.Arrays;

public class UnderstandingNullKeyword {

    public static void main(String[] args) {

        String name = null;

        Integer age = null;
        //int age = null; // does not compile

        System.out.println(name);

        String[] names = new String[5];
        System.out.println(Arrays.toString(names));

        names[2] = "Mariia";
        names[0] = "Bahar";
        names[1] = "";
        names[4] = "Dajve";

        System.out.println(Arrays.toString(names));


        for (String element: names) {
            System.out.println(element.toUpperCase());
        }


        Integer[] numbers = new Integer[5];

        String s = Arrays.toString(numbers);

        System.out.println("Integer array " + s);

    }
}
