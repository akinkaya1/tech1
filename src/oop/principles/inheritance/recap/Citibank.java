package oop.principles.inheritance.recap;

public class Citibank extends Bank{

    @Override
    public double interestRate() {
        System.out.println("this is Citibank method");
        return 3;
    }
}
