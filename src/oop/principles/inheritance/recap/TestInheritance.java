package oop.principles.inheritance.recap;

import oop.principles.abstraction.Phone;
import oop.principles.abstraction.Samsung;
import oop.principles.abstraction.iPhone;
import oop.principles.inheritance.Chase;

public class TestInheritance {

    public static void main(String[] args) {

        Chase chase = new Chase();
        System.out.println(chase.interestRate());
        chase.deposit();

        Citibank citibank = new Citibank();

        System.out.println(citibank.interestRate());
        citibank.deposit();

        Bank bank = new Bank();

        Samsung samsung = new Samsung();

        iPhone iPhone =  new iPhone();
    }
}
