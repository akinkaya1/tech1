package variables;

public class DeclaringVariables {
    /*
    There are 2 possible ways to declare a variable
    dataType variableName;
    -> this specifies its data type and reserves memory for it

    dataType variableName = initialValue;
    -> specifies its data type and reserves memory for it and puts
    and initial value into that memory. The initial value
    must be correct data type

     */
    public static void main(String[] args) {
        int age; //declare the variable "age"
        int yearOfBirth = 1993;

        age = 60;

        System.out.println(age);
    }
}
