package exceptions;

import oop.constructors.Cat;

public class NullPointer {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("Reference of the cat object is: " + cat); //A reference in Stack

        cat = null; // Turns reference to null
        System.out.println("Reference of the cat object is: " + cat); //it will be null

        try{
            cat.clean(); // NullPointerException as the object lost reference and already garbage collected
        }
        catch (NullPointerException e){
            System.out.println("Exception is caught: " + e.getMessage());
        }

        System.out.println("More code to run");
        System.out.println("End of the program");

    }
}
