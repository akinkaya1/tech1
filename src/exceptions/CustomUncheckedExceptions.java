package exceptions;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CustomUncheckedExceptions {
    //We can create both checked and unchecked exceptions

    public int checkAge(int age){
        if(age < 16){
            throw new RuntimeException("Age " + age + " is not allowed!!!");
        }
        return age;
    }

    public void readFile(File file) throws FileNotFoundException {
        FileReader fileReader = new FileReader(file);
        //read file code
    }

    public String getDayOfTheWeek(int index){
        String day;
        switch (index){
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                throw new RuntimeException("The day does not exists for the given index!!!");
        }
        return day;
    }
}
