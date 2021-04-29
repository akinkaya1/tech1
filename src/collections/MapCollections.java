package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapCollections {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>();

        capitals.put("Spain", "Madrid");
        capitals.put("Italy", "Rome");
        capitals.put("Ukraine", "Kyiv");
        capitals.put("Ukraine", "Kiev");

        //
        System.out.println(capitals.size());
        System.out.println(capitals.get("Ukraine")); // Kiev

        System.out.println("HashMap keys : " + capitals.keySet()); //return all the keys
        System.out.println("HashMap values : " + capitals.values()); // return all the values
        System.out.println("HashMap keys and values : " + capitals.entrySet()); // return all keys and values

        HashSet<String> countries = new HashSet<>(capitals.keySet());
        System.out.println(countries);

        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();
        students.put(1, "Mariia");
        students.put(2, "Bahar");
        students.put(3, "Dajve");
        students.put(4, "Murat");
        students.put(null, null);
        students.put(5, null);
        students.put(6, null);

        System.out.println("LinkedHasMap keys : " + students.keySet());
        System.out.println("LinkedHasMap values : " + students.values());
        System.out.println("LinkedHasMap keys and values : " + students.entrySet());




    }
}
