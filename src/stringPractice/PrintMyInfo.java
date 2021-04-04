package stringPractice;

public class PrintMyInfo {
    /*
    PSEUDO CODE of our program
    -call main() method
    -declare my variables firstName, lastName, DOB, address
    -assign values into my variables
    -print those values
     */

    public static void main(String[] args) {
        String firstName;
        String lastName;
        String dateOfBirth;
        String address;

        firstName = "Dajve";
        lastName = "Echols";
        dateOfBirth = "12/12/1997";
        address = "4280 ABC St, Chicago IL 12345";

        System.out.println("My name is: " + firstName + "\nMy last name is: " + lastName +
                            "\nMy DOB is: " + dateOfBirth + "\nMy address: " + address);
    }
}
