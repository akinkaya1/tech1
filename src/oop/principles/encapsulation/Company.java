package oop.principles.encapsulation;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();

        /**
        Old way - not safe
        employee1.firstName = "Lionel";
        System.out.println(employee1.firstName);
         */

        employee1.setFirstName("Lionel");
        System.out.println(employee1.getFirstName()); // Lionel

        System.out.println(employee1.getFirstName().toUpperCase()); // LIONEL

        /**
        set employee1 lastName to be "Messi"
        and then check if lastName' length is 5 and also it starts with M
        If both conditions are true, then print true, else print false
         */

        employee1.setLastName("Messi");

        if(employee1.getLastName().length() == 5 && employee1.getLastName().startsWith("M")){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        /*
        Set gender to be Male and age to be 30
        Then check if gender is male and also age is less than 20
        If gender is male and age is less than 20, print young male employee
        else print not male or not young
         */

        employee1.setAge(30);
        employee1.setGender("Male");

        if(employee1.getGender().equalsIgnoreCase("male") && employee1.getAge() < 20){
            System.out.println("This is a young male employee");
        }
        else{
            System.out.println("This is not male or not young");
        }
    }
}
