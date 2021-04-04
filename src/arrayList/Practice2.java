package arrayList;

import java.util.Iterator;
import java.util.LinkedList;

public class Practice2 {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(30);
        numbers.add(40);
        numbers.add(10);
        numbers.add(50);

        System.out.println(numbers);

        /*
        First way

        remove all elements which are 10 -> [30, 40, 50]
        Create a new List
        put all elements that are 10
        then use removeAll method to remove 10s


        LinkedList<Integer> tens = new LinkedList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) == 10) tens.add(numbers.get(i));
        }

        System.out.println("Tens list " + tens);

        numbers.removeAll(tens);

        System.out.println("My numbers after 10s are removed = " + numbers);
         */

        //2nd way

        Iterator iterator = numbers.iterator();

        while(iterator.hasNext()){
            if(iterator.next().equals(10)) {
                iterator.remove();
            }
        }

        System.out.println("My list after removing with iterator is = " + numbers);
    }
}
