package oop.principles.abstraction;

public interface Television {

    //What we can have in the interface
    //All the methods in the interface are public abstract

    public static final String interfaceName = "Television"; // it is "public static final" by default

    public abstract void haveTV();
    void haveChannels(); // it is public abstract by default

    //added with Java8 version
    default void remote(){
        System.out.println("Remote method from Television interface");
    }

    //added with Java9 version
    public static void print(){
        System.out.println("Static method from Television interface");
    }
}
