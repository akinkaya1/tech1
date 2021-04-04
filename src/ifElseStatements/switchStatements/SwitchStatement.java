package ifElseStatements.switchStatements;

public class SwitchStatement {
    public static void main(String[] args) {
        //if number is 1, then print "Number is 1"
        //if number is 2, then print "Number is 2"
        //if it is not 1 or 2, "Number is not valid"

        int number = 3;  //can be only 1 or 2

        /*
        if(number == 1){
            System.out.println("Number is 1");
        }
        else if(number == 2){
            System.out.println("Number is 2");
        }
        else{
            System.out.println("Number is not valid!!!");
        }
        */

        switch (number){
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            default:
                System.out.println("Number is not valid!!!");
        }
    }
}
