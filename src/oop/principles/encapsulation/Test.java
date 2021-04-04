package oop.principles.encapsulation;

public class Test {
    public static void main(String[] args) {

        //Create a Person object and set fullName. age and gender
        Person person1 = new Person();

        person1.setFullName("Lionel Messi");
        person1.setAge(30);
        person1.setGender("male");

        System.out.println(person1.getFullName());
        System.out.println(person1.getAge());
        System.out.println(person1.getGender());

        Person person2 = new Person();

        person2.setFullName("Cristiano Ronaldo");
        person2.setAge(35);
        person2.setGender("male");

        /*
        Print all information of the person who is older
         */

        if(person1.getAge() > person2.getAge())
            System.out.println(person1.getFullName()+ " " + person1.getAge() + " " + person1.getGender());
        else {
            System.out.println(person2.getFullName()+ " " + person2.getAge() + " " + person2.getGender());
        }
    }
}
