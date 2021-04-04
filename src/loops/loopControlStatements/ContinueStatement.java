package loops.loopControlStatements;

public class ContinueStatement {
    public static void main(String[] args) {
        //I don't want to print 13 et all

        for (int i = 1; i <= 20; i++) {
            if(i % 5 == 0){
                System.out.println("bazz");
            }
            else System.out.println(i);
        }
    }
}
