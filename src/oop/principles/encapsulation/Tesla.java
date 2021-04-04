package oop.principles.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Tesla {
    public static void main(String[] args) {
        Department department1 = new Department();
        Department department2 = new Department();
        Department department3 = new Department();

        /*
        Set department as Sales, Human Resources, Information Technology
        Set their locations to be Chicago, San Francisco, Miami
        Set their employee number to be 15, 3, 20
         */

        //Department-1
        department1.setLocation("Chicago");
        department1.setName("Sales");
        department1.setTotalNumberOfEmployees(15);

        //Department-2
        department2.setName("Human Resources");
        department2.setLocation("San Francisco");
        department2.setTotalNumberOfEmployees(3);

        //Department-3
        department3.setLocation("Miami");
        department3.setName("Information Technology");
        department3.setTotalNumberOfEmployees(20);

        List<Department> departmentList = new ArrayList<>();
        departmentList.add(department1);
        departmentList.add(department2);
        departmentList.add(department3);

        for (Department element: departmentList) {
            System.out.println(element.getName() + " : " + element.getLocation() +  " : " + element.getTotalNumberOfEmployees());
        }

        /*
        Find the department that has most employees
        Information Technology
         */

        /*Hard-coded way
        int dept1Employees = department1.getTotalNumberOfEmployees();
        int dept2Employees = department2.getTotalNumberOfEmployees();
        int dept3Employees = department3.getTotalNumberOfEmployees();

        int mostEmployees = Math.max((Math.max(dept1Employees, dept2Employees)), dept3Employees);
        */

        //More proper way
        int mostEmployees = 0;
        for (Department element: departmentList) {
            if(element.getTotalNumberOfEmployees() > mostEmployees) mostEmployees = element.getTotalNumberOfEmployees();
        }

        System.out.println("Most employees is = " + mostEmployees); // 20

        for (Department d: departmentList) {
            if(d.getTotalNumberOfEmployees() == mostEmployees){
                System.out.println("The department " + d.getName() + " has the most employees: " + mostEmployees);
                break;
            }
        }
    }
}
