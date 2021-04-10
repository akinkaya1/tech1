package oop.principles.polymorphism;

public class Apple extends GreenFruits{
    @Override
    public void taste() {
        System.out.println("Apple tastes");
    }

    public void appleMethod(){
        System.out.println("This is apple");
    }
}
