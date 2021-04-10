package oop.principles.abstraction;

public class iPhone extends Phone implements Television, Bluetooth{
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

    @Override
    public void haveTV() {
        System.out.println("iPhone has TV");
    }

    @Override
    public void haveChannels() {
        System.out.println("iPhone TV has channels");
    }

    @Override
    public boolean haveBluetooth() {
        return true;
    }
}
