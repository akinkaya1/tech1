package oop.practicingStudents;

public class TestStudent {

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();


        System.out.println(Student.totalNumberOfCampusStudents); // 5
        System.out.println(Student.totalNumberOfOnlineStudents); // 1
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);



        student1.firstName = "Murat";
        student1.lastName = "Erdem";
        student1.gender = "Male";

        System.out.println(student1.firstName + " " + student1.lastName + " " + student1.gender);

        student2.firstName = "Dajve";
        student2.lastName = "Echols";
        student2.gender = "Male";

        student3.firstName = "Volkan";
        student3.lastName = "Gurler";
        student3.gender = "Male";

        student4.firstName = "Kaan";
        student4.lastName = "Yildiz";
        student4.gender = "Male";

        student5.firstName = "Bahar";
        student5.lastName = "Yucel";
        student5.gender = "Female";

        student6.firstName = "Mariia";
        student6.lastName = "Seradokha";
        student6.gender = "Female";

        System.out.println(student6.gender); // Female
        System.out.println(student3.firstName); // Volkan
        System.out.println(student5.lastName); // Yucel

    }
}
