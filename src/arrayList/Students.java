package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Students {
    public static void main(String[] args) {

        //Create an ArrayList and add 6 students
        ArrayList<String> students1 = new ArrayList<>();

        students1.add("Volkan");
        students1.add("Mariia");
        students1.add("Murat");
        students1.add("Bahar");
        students1.add("Kaan");
        students1.add("Dajve");

        ArrayList<String> allStudents = new ArrayList<>();
        allStudents.addAll(students1);
        allStudents.add("Raqi");
        allStudents.add("Mujgan");
        allStudents.add(2,"Lionel");
        allStudents.set(1, "Seredokha");


        System.out.println("All students " + allStudents);

        System.out.println("Third student from all students is " + allStudents.get(2));
        System.out.println("The size of the all students ArrayList = " + allStudents.size());


        //Create an array and add 6 students
        String[] studentArray = new String[6];
        studentArray[0] = "Volkan";
        studentArray[1] = "Bahar";
        studentArray[2] = "Mariia";
        studentArray[3] = "Dajve";
        studentArray[4] = "Murat";
        studentArray[5] = "Kaan";
        studentArray[2] = "Seredokha";

        System.out.println("Student array = " + Arrays.toString(studentArray));

    }
}
