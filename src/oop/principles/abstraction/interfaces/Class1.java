package oop.principles.abstraction.interfaces;

public class Class1 implements Interface1{
    @Override
    public void interfaceOneMethod() {
        System.out.println("This is overridden method from interface 1");
    }

    @Override
    public void interfaceTwoMethod() {
        System.out.println("This is overridden method from interface 2");
    }

    @Override
    public void interfaceThreeMethod() {
        System.out.println("This is overridden method from interface 3");
    }


}
