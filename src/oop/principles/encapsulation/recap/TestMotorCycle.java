package oop.principles.encapsulation.recap;

public class TestMotorCycle {

    public static void main(String[] args) {
        Motorcycle motorcycle1 = new Motorcycle();

        motorcycle1.color = "Black"; // Set data

        String colorOfMotorcycle = motorcycle1.color; // get data

        System.out.println(colorOfMotorcycle); // Black

        System.out.println(motorcycle1.getEngineSize()); // 1.2

        motorcycle1.getGasCapacity(); // get data

    }
}
