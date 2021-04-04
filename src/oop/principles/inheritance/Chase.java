package oop.principles.inheritance;

import oop.principles.inheritance.recap.Bank;

public class Chase extends Bank{

    @Override
    public double interestRate() {
        System.out.println("this is Chase method");
        return 20;
    }
}
