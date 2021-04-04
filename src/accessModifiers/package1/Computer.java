package accessModifiers.package1;

public class Computer {

    public Computer(){

    }

    {
        System.out.println("Instance block");
    }

    static {
        System.out.println("Static block");
    }

    //Access modifiers can be used with constructors, methods and fields

    //Fields of Computer: memory, model, brand, color

    public int memory; //can be used anywhere in the project
    protected String model; //can be used only in the same package
    String brand; //can be used only in the same package
    private String color; //can be used only in the same class
}
