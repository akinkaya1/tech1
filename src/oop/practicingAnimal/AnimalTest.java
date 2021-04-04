package oop.practicingAnimal;

public class AnimalTest {

    public static void main(String[] args) {

        Animal lion = new Animal();
        Animal catBusia =  new Animal();
        Animal cow = new Animal();

        System.out.println(Animal.hasEyes); // true

        cow.color = "Black";
        cow.family = "Mammal)";
        cow.gender = "Female";
        cow.size = "Medium";
        cow.carnivore = false;
        cow.herbivore = true;
        cow.omnivore = false;

        cow.color = "White";

        catBusia.family = "Cats";
        catBusia.size = "Medium";
        catBusia.color = "Grey";
        catBusia.gender = "Female";
        catBusia.omnivore = true;
        catBusia.carnivore = false;
        catBusia.herbivore = false;

        lion.family = "Cats";
        lion.size = "Large";
        lion.color = "Beige";
        lion.gender = "Male";
        lion.carnivore = true;
        lion.omnivore = false;
        lion.herbivore = false;

        if(lion.carnivore){
            System.out.println("Lions are carnivore");
        }
        else{
            System.out.println("Lions are not carnivore");
        }

        System.out.println(lion.carnivore); // true
        System.out.println(catBusia.carnivore); // false
        System.out.println(cow.herbivore); // true
        System.out.println(cow.color); // black

    }
}
