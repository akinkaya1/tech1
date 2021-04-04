package oop.creatingClassAndObject;

public class TestCar {
    public static void main(String[] args) {

        //My garage
        Car tesla = new Car();
        Car mercedes = new Car();
        Car audi = new Car();
        Car bmw = new Car();

        tesla.color = "White";
        mercedes.color = "Black";
        audi.color = "White";
        bmw.color = "Black";

        tesla.year = 2021;

        bmw.year = 2020;

        System.out.println("Color of tesla = " + tesla.color);
        System.out.println("Color of mercedes = " + mercedes.color);
        System.out.println("Color of audi = " + audi.color);
        System.out.println("Color of BMW = " + bmw.color);

        System.out.println();
        System.out.println("Year of tesla = " + tesla.year); // 2021
        System.out.println("Year of mercedes = " + mercedes.year); // default = 2019
        System.out.println("Year of audi = " + audi.year); // default = 2019
        System.out.println("Year of BMW = " + bmw.year); // 2020

        audi.engine = 2.0;
        audi.make = "Audi";
        audi.model = "A7";
        audi.trim = "Sport";

        System.out.println();
        System.out.println("Engine of audi = " + audi.engine);
        System.out.println("Make of audi = " + audi.make);
        System.out.println("Model of audi = " + audi.model);
        System.out.println("Trim of audi = " + audi.trim);


        System.out.println(bmw.make); //

    }
}
