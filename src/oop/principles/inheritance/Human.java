package oop.principles.inheritance;

public class Human {

    public Human(String name, String gender){
        this.name = name;
        this.gender = gender;
    }

    //Instance variables
    public String name;
    protected String gender;
    String address;
    private int ssn;


    //Methods

    public void learn(){
        System.out.println("Human learns");
    }

    public void eat(){
        System.out.println("Human eats");
    }
}
