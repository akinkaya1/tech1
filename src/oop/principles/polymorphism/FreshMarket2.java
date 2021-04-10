package oop.principles.polymorphism;

import oop.principles.abstraction.Samsung;

import java.util.Arrays;

public class FreshMarket2 {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit();
        Fruit fruit2 = new GreenFruits();
        Fruit fruit3 = new Apple();
        Apple apple = new Apple();
        GreenFruits greenFruits = new GreenFruits();
        Fruit fruit =  new Fruit();

        //Apple extends GreenFruits extends Fruit

        Fruit[] fruits = {fruit1, fruit2, fruit3, apple, greenFruits, fruit}; // polymorphic array

        for (Fruit element: fruits) {
            element.taste();
        }
    }
}
