package ifElseStatements.switchStatements;

public class SwitchChar {
    public static void main(String[] args) {
        char c = 'C';

        switch (c){
            case 'A':
                System.out.println("Character is A");
                break;
            case 'B':
                System.out.println("Character is B");
                break;
            case 'C':
                System.out.println("C");
                break;
            default:
                System.out.println("Character is not A or B");
        }

        System.out.println("End of the program");
    }
}
