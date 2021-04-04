package oop.principles.inheritance.recap;

public class Bank {

    protected String name;
    private double capital;
    protected String headAddress;

    public double interestRate(){
        System.out.println("this is Bank method");
        return 30;
    }


    public void deposit(){
        System.out.println("This bank depositing");
    }
}
