package ifElseStatements;

import java.util.Scanner;

public class TernaryOperatorExample {
    public static void main(String[] args) {

        String name = "Alex";

        Scanner input = new Scanner(System.in);
        System.out.println("Hey Alex! Could you please tell us your gender?");
        String gender = input.next();

        String message;

        /*
        if(gender.equalsIgnoreCase("male")){ // male, MAle, MALE
            message = "Alex is " + gender;
        }
        else if(gender.equalsIgnoreCase("female")){ // female, feMALe , FEMALE
            message = "Alex is " + gender;
        }
        else{
            message = "You did not enter correct data!!! You entered: " + gender;
        }
        */

        message = gender.equalsIgnoreCase("male") ? "Alex is male" : "Alex is female";

        System.out.println(message);
    }
}
