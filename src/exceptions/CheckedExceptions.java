package exceptions;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("myFile.txt");

        //First way to handle checked exception
        try{
            FileWriter fileWriter = new FileWriter(file);
        }
        catch (Exception e){
            System.out.println("The error message is: " + e.getMessage());
        }


        //Second way to handle checked exception. Adding exception to the method signature. Not preferred, better to use try-catch blocks
        FileReader fileReader =  new FileReader(file);
    }
}
