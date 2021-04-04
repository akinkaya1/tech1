package oop.principles.encapsulation;

public class Department {

    //name, totalNumberOfEmployees, location
    //Departments: Sales, IT, HR

    static int totalNumberOfDepartments = 3;

    private int totalNumberOfEmployees;
    private String name;
    private String location;

    public int getTotalNumberOfEmployees() {
        return totalNumberOfEmployees;
    }

    public void setTotalNumberOfEmployees(int totalNumberOfEmployees) {
        this.totalNumberOfEmployees = totalNumberOfEmployees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
