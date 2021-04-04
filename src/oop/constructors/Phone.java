package oop.constructors;

public class Phone {

    public Phone(){
        //default constructor
    }

    public Phone(String brand){
        //1 arg constructor
        this.brand = brand;
    }

    public Phone(String brand, String color){
        //2 args constructor
        this(brand); // this will call constructor with 1 arg and assign brand to object
        this.color = color;
    }

    public Phone(String brand, String color, int storage){
        //3 args constructor
        this(brand, color); // this will call constructor with 2 args and assign those to object
        this.storage = storage;
    }

    String brand;
    String color;
    int storage;

    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("iPhone");

        Phone phone3 = new Phone("Samsung", "Black");

        Phone phone4 = new Phone("Nokia", "Gray", 4);

        System.out.println(phone2.brand); // iPhone

        System.out.println("Phone 3 color " + phone3.color); // Black
        System.out.println("Phone 3 brand " + phone3.brand); // Samsung

        phone4.storage = 16;

        System.out.println("Phone 4 storage " + phone4.storage); // 16
    }
}
