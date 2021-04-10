package oop.principles.polymorphism;

import oop.principles.abstraction.*;

import java.util.ArrayList;
import java.util.List;

public class PhoneStore {
    public static void main(String[] args) {
        Samsung samsung1 = new Samsung();
        Phone samsung2 = new Samsung();
        Device samsung3 = new Samsung();
        Television samsung4 = new Samsung();
        Bluetooth samsung5 = new Samsung();

        //REAL EXAMPLE FROM JAVA
        List<String> names1 = new ArrayList<>();
        ArrayList<String> names2 = new ArrayList<>();
        Cloneable names3 = new ArrayList<>();
    }
}
