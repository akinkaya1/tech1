package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) throws IOException {
        //Creating a file way 1
        File file = new File("names.docx");

        //createNewFile() method is used to create a file
        if(file.createNewFile()){
            System.out.println("File is created");
        }
        else{
            System.out.println("Issue with creating file or file already exists");
        }


        //Creating file way-2
        FileWriter fileWriter = new FileWriter("studentsList.txt");

        //Write data to created file
        fileWriter.write("Mariia");
        fileWriter.write("\nLionel");
        //Add Alex, David, Max
        fileWriter.write("\nAlex");
        fileWriter.write("\nDavid");
        fileWriter.write("\nMax");

        fileWriter.close();

    }
}
