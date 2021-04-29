package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetCollections {
    public static void main(String[] args) {
        HashSet<Integer> numbers1 = new HashSet<>();
        numbers1.add(5);
        numbers1.add(5);
        numbers1.add(5);
        numbers1.add(-19);
        numbers1.add(0);
        numbers1.add(-15);
        numbers1.add(10);
        numbers1.add(20);
        numbers1.add(null);
        numbers1.add(null);
        numbers1.add(null);

        System.out.println("HashSet is : " + numbers1);
        System.out.println("HashSet size : " + numbers1.size());

        LinkedHashSet<Integer> numbers2 = new LinkedHashSet<>();
        numbers2.add(5);
        numbers2.add(5);
        numbers2.add(5);
        numbers2.add(-19);
        numbers2.add(0);
        numbers2.add(-15);
        numbers2.add(10);
        numbers2.add(20);
        numbers2.add(null);
        numbers2.add(null);
        numbers2.add(null);

        System.out.println("LinkedHashSet : " + numbers2);
        System.out.println("LinkedHashSet size : " + numbers2.size());

        TreeSet<Integer> numbers3 = new TreeSet<>();
        numbers3.add(5);
        numbers3.add(5);
        numbers3.add(5);
        numbers3.add(-19);
        numbers3.add(0);
        numbers3.add(-15);
        numbers3.add(10);
        numbers3.add(20);


        try{
            numbers3.add(null); //will throw NullPointerException
        }
        catch (Exception e){
            System.out.println("Error message is : " + e.getMessage());
        }


        System.out.println("TreeSet : " + numbers3);
        System.out.println("TreeSet size : " + numbers3.size());
    }
}
