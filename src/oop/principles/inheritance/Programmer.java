package oop.principles.inheritance;

public class Programmer extends Human {


    public Programmer(String name, String gender) {
        super(name, gender);
    }

    public Programmer (String name, String gender, String address){
        super(name, gender); // calling constructor super()
        super.address = address; // calling field
    }

    //We can override methods in the parent class based on our need in the Child class
    @Override
    public void learn() {
        System.out.println("Programmer learns");
    }

    @Override
    public void eat() {
        System.out.println("Programmer eats");
    }

    //Coding is specific method to Programmer class, we don't have this in Human
    public void coding(){
        System.out.println("Programmer codes");
    }
}
