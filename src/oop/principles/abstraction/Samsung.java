package oop.principles.abstraction;

public class Samsung extends Phone{

    @Override
    public void call() {
        //Body or implementation of the abstract call() method from Phone
        System.out.println("Samsung is calling");
    }

    @Override
    public void haveCamera() {
        System.out.println("Samsung is having camera");
    }

    @Override
    public boolean text() {
        return true;
    }

    @Override
    public void downloadApp() {
        System.out.println("PlayStore");
    }

    @Override
    public void shareFiles() {
        System.out.println("Samsung is sharing files");
    }

    @Override
    public void haveHotSpot() {
        System.out.println("Samsung have hotspot");
    }

    @Override
    public void reliable() {
        System.out.println("Samsung is reliable");
    }
}
