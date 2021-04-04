package loops.loopControlStatements;

public class BreakStatement {
    public static void main(String[] args) {

        //I don't want to print any number that is 5 or bigger than 5
        for (int i = 1; i <= 10; i++) {

            if(i == 5){
                break;
            }
            System.out.println(i);
        }
    }
}
