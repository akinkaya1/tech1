package oop.practicingStudents;

public class Student {

    public Student(){
        // default constructor
    }

    //Final fields will be constant for each object of this class
    static final int totalNumberOfOnlineStudents = 1;
    static final int totalNumberOfCampusStudents = 5;

    //Dynamic instance variables may change for each object created from this class
    String firstName;
    String lastName;
    String gender;
}
