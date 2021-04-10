package oop.principles.polymorphism;

public class FreshMarket {
    public static void main(String[] args) {

        Fruit fruit = new Fruit();
        fruit.taste(); // Fruit tastes
        fruit.fruitMethod();

        GreenFruits greenFruit = new GreenFruits();
        greenFruit.taste(); // Green fruit tastes
        greenFruit.greenFruitMethod();

        Apple apple = new Apple();
        apple.taste(); // Apple tastes
        apple.appleMethod();

        Fruit apple2 = new Apple();
        apple2.taste(); //Apple tastes

        Fruit greenFruit2 = new GreenFruits();
        greenFruit2.taste(); // Green fruit tastes


        // Apple - GreenFruit - Fruit
        GreenFruits greenFruits3 = (GreenFruits) new Fruit();
        greenFruits3.taste(); // it will throw java.lang.ClassCastException
    }
}
