package exceptions;

import java.io.FileWriter;

public class TestCustomExceptions {
    public static void main(String[] args){
        CustomUncheckedExceptions customExceptions = new CustomUncheckedExceptions();

        //try catch finally block can be used to handle this exception as well
        //This method is throwing exception when age is under 16
        System.out.println(customExceptions.checkAge(20));

        //This method is throwing exception when index is not bt 1 and 7

        System.out.println(customExceptions.getDayOfTheWeek(8));


        try {
            FileWriter fileWriter = new FileWriter("anyFile.txt");// checked exceptions
            CustomCheckedException customCheckedException = new CustomCheckedException(); // custom checked exception
        }
        catch (Exception exception){
            System.out.println("Checked exception is handled: " + exception.getMessage());
        }
    }
}
