package fileHandling;

import java.io.File;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        //Make sure this file exists
        File file = new File("studentsList.txt");

        System.out.println(file.exists()); // this will return true if file exists
        System.out.println(file.canRead()); // this will return true if file can read
        System.out.println(file.canWrite()); // this will return true if file can write
        System.out.println(file.getName()); // this will return file name
        System.out.println(file.getAbsolutePath()); // this will return where file is located (path)

        try{
            Scanner fileReader = new Scanner(file);

            while(fileReader.hasNextLine()){
                System.out.println(fileReader.nextLine());
            }

            fileReader.close(); // it should be closed once you are done with reading
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
