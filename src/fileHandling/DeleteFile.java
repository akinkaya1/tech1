package fileHandling;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("names.docx");

        //file.delete(); // this will return true if file is deleted

        if(file.delete()){
            System.out.println("File is deleted: " + file.getName());
        }
        else{
            System.out.println("An error occurred or you already deleted this file before :)))");
        }
    }
}
