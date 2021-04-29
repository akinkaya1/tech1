package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(2);
        numbers.add(30);
        numbers.add(1);
        numbers.add(7);

        //this will throw a ConcurrentModificationException
        // but 10 will be removed
        try{
            for (Integer i: numbers) {
                if(i == 10) numbers.remove(i);
            }
        }
        catch (Exception e){
            System.out.println("Error message is : " + e.getMessage());
        }

        Iterator<Integer> iterator = numbers.iterator();

        while(iterator.hasNext()){
            Integer myNextNumber = iterator.next();
            if(myNextNumber < 10) iterator.remove();
        }

        System.out.println(numbers);
        System.out.println(iterator.toString());
    }
}
