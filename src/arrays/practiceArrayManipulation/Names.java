package arrays.practiceArrayManipulation;

public class Names {
    public static void main(String[] args) {
        /**
         TASK-1
         Create a new array of String
         Store all students name we have
         Print names that starts with M or m only
         */

        System.out.println(">>>>>>>>>>>>>>TASK-1<<<<<<<<<<<<<<<");
        System.out.println();
        String[] names = {"Bahar", "Kaan", "Murat", "Mariia", "Volkan", "Dajve"};

        for (int i = 0; i < names.length; i++) {
            if(names[i].toLowerCase().startsWith("m")) System.out.println(names[i]);
        }


        /**
         TASK-2
         Use above names array
         Print all names and say Hello to them
         Hello Bahar, How are you?
         Hello Kaan, How are you?
         Hello Murat, How are you?
         Hello Mariia, How are you?
         Hello Volkan, How are you?
         Hello Dajve, How are you?
         */
        System.out.println();
        System.out.println(">>>>>>>>>>>>>>TASK-2<<<<<<<<<<<<<<<");
        System.out.println();

        for (int i = 0; i < names.length; i++) {
            System.out.println("Hello " + names[i] + "! How are you?");
        }


        /**
         TASK-3
         Use above names array
         Print the names that are having at least the length of 5
         */

        System.out.println();
        System.out.println(">>>>>>>>>>>>>>TASK-3<<<<<<<<<<<<<<<");
        System.out.println();
        for (int i = 0; i < names.length; i++) {
           if(names[i].length() >= 5)  System.out.println(names[i]);
        }
    }
}
