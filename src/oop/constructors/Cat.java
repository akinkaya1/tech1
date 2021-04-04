package oop.constructors;

public class Cat {

    /*
     What features -  attributes cat has
     -color -eyeColor -size -height -weight -breed -age

     What behaviors cat has
     -meowing -sleeping -eating -scratching -stretching -playing -clean
     */
    public Cat(String name, int age, String color){
        // custom constructor with 3 args
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Cat(){
        //default constructor
    }

    public Cat(String name, int age){
        // custom constructor with 2 args
        this.name = name;
        this.age = age;
    }




    public final static String family = "Feline";
    public String name;
    public String color;
    String eyeColor;
    String size;
    double height;
    double weight;
    String breed;
    int age;

    public void meowing(){
        System.out.println("This cat is meowing");
    }

    public static void sleeping(String name){
        System.out.println("Cat sleeps");
    }

    public static void eating(){
        System.out.println("Cat eats");
    }

    public static void scratching(){
        System.out.println("Cat scratches");
    }

    public static void stretching(){
        System.out.println("Cat stretches");
    }

    public void playing(){
        System.out.println("This cat is playing");
    }

    public void clean(){
        System.out.println("This cat is cleaning itself");
    }

    public static void getFamily(){
        System.out.println("Cats are " + family);
    }

    public static void printCatInfo(Cat cat){
        if(cat.name != null) System.out.println("The name of cat is " + cat.name);
        if(cat.age != 0) System.out.println("The age of cat is " + cat.age);
        if(cat.color != null) System.out.println("The color of cat is " + cat.color);
        if(cat.eyeColor != null) System.out.println("The eyecolor of cat is " + cat.eyeColor);
        if(cat.breed != null) System.out.println("The breed of cat is " + cat.breed);
        if(cat.height != 0.0) System.out.println("The height of cat is " + cat.height);
        if(cat.weight != 0.0) System.out.println("The weight of cat is " + cat.weight);
        if(cat.size != null)System.out.println("The size of cat is " + cat.size);
    }



    public static void main(String[] args) {
        Cat cat1 = new Cat("Sky", 2); // We can create object with the help of constructors
        Cat cat2 = new Cat("Fluffy", 3, "white");
        Cat cat3 = new Cat("Olive", 4, "black");

        Cat[] cats = {cat1, cat2, cat3};

        for (Cat element: cats) {
            System.out.println("\n-----Cat " + element.name + " information-----\n");
            Cat.printCatInfo(element);
        }
    }
}
