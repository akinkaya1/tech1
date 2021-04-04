package oop.principles.abstraction;

public class iPhone extends Phone{
    @Override
    public void call() {
        System.out.println("iPhone is calling");
    }

    @Override
    public void haveCamera() {
        System.out.println("iPhone have camera");
    }

    @Override
    public boolean text() {
        return true;
    }

    @Override
    public void downloadApp() {
        System.out.println("iPhone has AppleStore");
    }

    @Override
    public void shareFiles() {
        System.out.println("iPhone shares files");
    }

    @Override
    public void haveHotSpot() {
        System.out.println("iPhone has hotSpot");
    }

    @Override
    public void reliable() {
        System.out.println("iPhone is reliable");
    }
}
