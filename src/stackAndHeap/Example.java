package stackAndHeap;

import oop.constructors.Dog;
import oop.creatingClassAndObject.Car;
import oop.practicingAnimal.Animal;

public class Example {

    Dog dog = new Dog();

    public static void main(String[] args) {
        //Create a primitive
        int age;

        age = 45;

        int age2 = 32;

        System.out.println(age);
        System.out.println(age2);

        //Creating Object
        Car car1 = new Car();
        Car car3 = new Car();


        //When you make object references to be null - it means breaking reference
        car1 = car3;
        System.out.println("Location of car1 " + car1);
        System.out.println("Location of car3 " + car3);

        Animal animal1 = new Animal();

        System.out.println("The location of animal1 " + animal1);

        Car car2;

        //System.out.println("The location of car2 " + car2); // will not compile

        //Create a String object
        String name;
        name = "Lionel";

        //How to call garbage collector explicitly - 2 ways
        Runtime.getRuntime().gc();
        System.gc();
    }

    //Can be called to run a final block of code before garbage collection
    public void finalize(){
        System.out.println("Garbage collector is here to destroy " + this);
    }
}
