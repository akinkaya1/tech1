package oop.blocks;

public class Computer {

    static final boolean haveRAM;

    boolean takesCD;
    String brand;
    int storage;
    String color;
    String OS;

    {
        //Whenever or wherever a Computer object is created, first run this block
        System.out.println("This is first instance block from Computer Class");
        {
            String name = "";
            System.out.println("This is inner instance block inside the first instance block");
        }
    }

    {
        //Whenever or wherever a Computer object is created, first run this block
        System.out.println("This is second instance block from Computer Class");
    }

    static {
        haveRAM = true;
        System.out.println("This is first static block from Computer Class");
        {
            System.out.println("This is instance block in the first static block");
        }
    }

    static{
        System.out.println("This is second static block from Computer Class");

    }
}
