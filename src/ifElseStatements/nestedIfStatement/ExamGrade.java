package ifElseStatements.nestedIfStatement;

public class ExamGrade {
    public static void main(String[] args) {
        /*
        If exam grade is more than or equal to 60 > then Passed
        if exam result is bt 60 and 71 > then passed with C //61,62,63.....70
        if exam result is bt 70 and 81 > then passed with B //71,72,73....80
        if exam result is more than 80 > then passed with A //81, 82, 83.....100
         */

        int examGrade = 75;

        if(examGrade >= 60){
            System.out.println("You passed this exam");
            if(examGrade > 60 && examGrade < 71){
                System.out.println("You passed exam with C");
            }
            if(examGrade > 70 && examGrade < 81){
                System.out.println("You passed exam with B");
            }
            if(examGrade > 80 && examGrade <= 100){
                System.out.println("You passed exam with A");
            }
        }

        System.out.println("End of your program");
    }
}
