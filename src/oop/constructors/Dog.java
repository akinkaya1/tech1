package oop.constructors;

public class Dog {

    /*
    Task requirement 1
    Define Dog attributes - fields as below
    -breed, color, age
     */

    String breed;
    String color;
    int age;
    /*
    Task requirement 2
    Define 4 constructors
    1 - no argument
    2 - taking one argument (breed)
    3 - taking 2 args (breed, color)
    4 - taking 3 args (breed, color, age)
    NOTE: assign those args to fields
     */

    public Dog(){
        //default constructor
    }

    public Dog(String breed){
        //1 arg constructor
        this.breed = breed;
    }

    public Dog(int age){
        //1 arg constructor
        this.age = age;
    }

    public Dog(String breed, String color){
        //2 args constructor
        this.breed = breed;
        this.color = color;
    }

    public Dog(String breed, String color, int age){
        //3 args constructor
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    /*
    Task requirement 3
    Define Dog methods given below
    Every method will take Dog object as a parameter will print Dog.breed + "do some functions"
    - eat() -> static - void
    - run() -> non-static - void
    - swim() -> static - void
    - hunt() - non-static - void
     */

    public static void eat(Dog dog){
        System.out.println(dog.breed + " eats");
    }

    public void run(Dog dog){
        System.out.println(dog.breed + " runs");
    }

    public static void swim(Dog dog){
        System.out.println(dog.breed + " swims");
    }

    public void hunt(Dog dog){
        System.out.println(dog.breed + " hunts");
    }

     /*
    Task requirement 4
    Create printDogInfo method to print all dog features
    NOTE: this method will take a dog object as a parameter
    Make sure that you are eliminating default values
      */

    public static void printDogInfo(Dog dog){
        if(dog.breed != null) System.out.println("The breed of dog is " + dog.breed);
        if(dog.color != null) System.out.println("The color of dog is " + dog.color);
        if(dog.age != 0 ) System.out.println("The age of dog is " + dog.age);
    }

    /*
    Task requirement 5 - 1
    Create a main method to test our dog class
    Create a dog1 object with default constructor and define all attributes of that object
    Then print the attributes by using printDogInfo() method of Dog class

    Task requirement 5 - 2
    Create a dog2 object with 1 arg constructor and define all other attributes of that object manually
    Then print the attributes by using printDogInfo() method of Dog class

    Task requirement 5 - 3
    Create a dog3 object with 2 arg constructor and define all other attributes of that object manually
    Then print the attributes by using printDogInfo() method of Dog class

    Task requirement 5 - 4
    Create a dog4 object with 3 arg constructor and define all other attributes of that object manually
    Then print the attributes by using printDogInfo() method of Dog class
     */

    public static void main(String[] args) {

        //REQUIREMENT - 5 - 1
        Dog dog1 = new Dog();

        dog1.breed = "Pitbull";
        dog1.color = "White and black";
        dog1.age = 2;

        /*
        System.out.println(dog1.breed);
        System.out.println(dog1.color);
        System.out.println(dog1.age);
        Instead of this, I can use my method
         */
        System.out.println("\nREQUIREMENT - 5 - 1");
        Dog.printDogInfo(dog1);


        //REQUIREMENT - 5 - 2
        Dog dog2 = new Dog("Huskey");

        dog2.color = "Blue";
        dog2.age = 5;

        System.out.println("\nREQUIREMENT - 5 - 2");
        Dog.printDogInfo(dog2);


        //REQUIREMENT - 5 - 3
        Dog dog3 = new Dog("Puddle", "Brown");

        dog3.age = 3;

        System.out.println("\nREQUIREMENT - 5 - 3");
        Dog.printDogInfo(dog3);

        //REQUIREMENT - 5 - 3
        Dog dog4 = new Dog("Corgi", "Brown and White", 1);

        System.out.println("\nREQUIREMENT - 5 - 4");
        Dog.printDogInfo(dog4);

        System.out.println("\n\nPrinting with array");


        String[] names = {"Kaan", "Murat", "Bahar"};

        Dog[] dogs = {dog1, dog2, dog3, dog4};

        for (Dog element: dogs) {
            Dog.printDogInfo(element);
            System.out.println();
        }

        int[] dogsAges = {dog1.age, dog2.age, dog3.age};
        String[] dogsBreeds = {dog2.breed, dog4.breed, dog3.breed};

    }


}
