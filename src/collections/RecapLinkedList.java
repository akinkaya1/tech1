package collections;

import java.util.LinkedList;
import java.util.List;

public class RecapLinkedList {
    public static void main(String[] args) {
        //LinkedList
        LinkedList<Integer> studentIds = new LinkedList<>();

        studentIds.add(12); // 0
        studentIds.add(17); // 1
        studentIds.add(19); // 2
        studentIds.add(19); // 3
        studentIds.add(null);
        studentIds.add(null);
        studentIds.add(null);
        studentIds.add(null);
        studentIds.add(null);
        studentIds.add(null);
        studentIds.add(null);


        System.out.println("Full list before removing : " + studentIds); // [12, 17, 19, 19]

        studentIds.set(0, 23);

        studentIds.remove(1);

        System.out.println("After removing : " + studentIds); // [23, 19]

        studentIds.clear(); // studentIds.removeAll(studentIds); can also be used to removeAll

        //System.out.println(studentIds.getFirst()); // will return first element
        System.out.println(studentIds.poll());

        //System.out.println(studentIds.getLast()); // will return last element
        System.out.println(studentIds.peek());
    }
}
