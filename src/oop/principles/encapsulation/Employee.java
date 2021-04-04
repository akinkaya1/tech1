package oop.principles.encapsulation;

public class Employee {

    //firstName, lastName, gender and age

    /*
    The purpose of encapsulation is making fields private
    and protecting it to be accessed anywhere else than the class

    BUT, How I will use it
     */

    private String firstName;
    private String lastName;
    private String gender;
    private int age;

    /*
    To be able to access and do some actions on these private fields,
    we need to provide public getters and setters
    Getters and setters are the methods created to access to the private fields
    Getters are created to read data - and they are return type always
    Setters are created to write data - and they are void type always
     */

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
