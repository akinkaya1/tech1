package arrayList;

import java.util.LinkedList;

public class Practice {
    public static void main(String[] args) {
        /*
        Create an LinkedList of Operating Systems
        Add macOS, Windows and Linux in it
        Then print elements has length of 5 only

        Result:
        macOS
        Linux
         */

        LinkedList<String> operationSystems = new LinkedList<>();
        operationSystems.add("macOS"); // 0
        operationSystems.add("Windows"); // 1
        operationSystems.add("Linux"); // 2

        System.out.println("Size of list is = " + operationSystems.size()); //

        for (int i = 0; i < operationSystems.size(); i++) {
            if(operationSystems.get(i).length() == 5) System.out.println(operationSystems.get(i));
        }

        for (String element: operationSystems) {
            if(element.length() == 5) System.out.println(element);
        }
    }
}
