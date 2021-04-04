package oop.principles.inheritance;

public class HumanInheritance {
    public static void main(String[] args) {

        Programmer programmer1 = new Programmer("Lionel", "male");

        Singer singer1 = new Singer("Micheal Jackson", "male");

        Dancer dancer1 = new Dancer("Dancer", "female");

        programmer1.eat();
        programmer1.learn();

        singer1.eat();
        singer1.learn();

        dancer1.eat();
        dancer1.learn();

    }
}
