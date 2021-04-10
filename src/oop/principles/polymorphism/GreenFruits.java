package oop.principles.polymorphism;

public class GreenFruits extends Fruit{
    @Override
    public void taste() {
        System.out.println("Green fruit tastes");
    }

    public void greenFruitMethod(){
        System.out.println("This is green fruit");
    }
}
