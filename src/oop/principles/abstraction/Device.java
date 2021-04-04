package oop.principles.abstraction;

public abstract class Device {

    public Device(){

    }

    public Device(String name){

    }


    private String name;
    final static String color = "White";
    protected boolean move;
    public String material;


    public abstract void reliable();
}
