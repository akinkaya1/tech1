package collections;

import java.util.*;

public class RemoveDuplicatesTask {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println(colors); // [Red, Green, Red, Yellow, Blue, Yellow]

        //Remove duplicates [Red, Green, Yellow, Blue]

        HashSet<String> colorsSet = new HashSet<>(colors);

        System.out.println("HashSet : " + colorsSet);

        System.out.println("LinkedHashSet : " + new LinkedHashSet<>(colors));
        System.out.println("TreeSet : " + new TreeSet<>(colors));

    }
}
