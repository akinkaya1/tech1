package oop.principles.abstraction;

public abstract class Phone extends Device {

    //We are a company and we want to create a template for phone companies
    //We will define almost all common features of a phone
    //BUT, we will not consider their implementation or the way it will be built

    /*
    call(), haveCamera(), text(), downloadApp(), shareFiles(), haveHotSpot()
     */

    public abstract void call(); // Rule: the body will be provided by each child class
    public abstract void haveCamera();
    public abstract boolean text(); // abstract methods can be return type as well
    public abstract void downloadApp();
    public abstract void shareFiles();
    public abstract void haveHotSpot();

}
