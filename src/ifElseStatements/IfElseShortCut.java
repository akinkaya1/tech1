package ifElseStatements;

public class IfElseShortCut {
    public static void main(String[] args) {
        int number = 10;

        if(number > 0){
            System.out.println("Number is positive");
        }
        else{
            System.out.println("Number is not positive");
        }

        /*
        Instead of above statement, a short cut can be used
        This can be done if there is only one statement in the if and else blocks
         */

        number -= 50; // -40
        if(number > 0) System.out.println("Number is positive");
        else System.out.println("Number is not positive");
    }
}
