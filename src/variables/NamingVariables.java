package variables;

public class NamingVariables {
    public static void main(String[] args) {

        /*
        We can use only characters from ‘a’ to ‘z’, ‘A’ to ‘Z’,
        numbers from ‘0’ to ‘9’,
        character ‘_’, and
        character ‘$’ for naming the variables
         */

        int myAge = 45;
        int MYAGE = 32;

        System.out.println(myAge); //45

        int i1 = 1;
        int i2 = 2;
        int i276354 = 3;

        char _myChar = 'c';
        char $_my$C_h67574ar = '5';

        // long 4myLong = 4563; this line will not compile as variable names cannot start with numbers

        int numberOfStudents = 45;
        //int numberOfStudents = 45; // this line will not compile as there is already a variable named as numberOfStudents

    }
}
