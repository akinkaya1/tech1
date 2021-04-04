package ifElseStatements.switchStatements;

public class SwitchString {
    public static void main(String[] args) {
        String name = "Bahar"; // Empty string, it is a string that holds nothing

        System.out.println(name);

        switch(name){
            case "Kaan":
                System.out.println("Kaan is one of out students");
                break;
            case "Bahar":
                System.out.println("Bahar is one of out students");
                break;
            case "Dajve":
                System.out.println("Dajve is one of out students");
                break;
            default:
                System.out.println("We do not know this guy!!!");
        }
    }
}
