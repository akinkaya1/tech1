package oop.principles.encapsulation.recap;

public class Motorcycle {

    //engineSize, color, gasCapacity, isSport

    private double engineSize = 1.2;
    private int gasCapacity = 2;
    public String color;
    public boolean isSport;

    public double getEngineSize(){
        return engineSize;
    }

    public int getGasCapacity() {
        return gasCapacity;
    }

    public void setGasCapacity(int gasCapacity){
        this.gasCapacity = gasCapacity;
    }

}
