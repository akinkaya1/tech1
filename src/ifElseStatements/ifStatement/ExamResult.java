package ifElseStatements.ifStatement;

import java.util.Scanner;

public class ExamResult {
    /*
    David took a math exam and the passing grade for the exam was 60.

    Write a program that asks David what is his grade.
    If David’s score is greater than or equal to 60,
    then print message “Awesome! So, you have passed this math exam!”.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey David! How was your math exam and the result?");
        int grade = scanner.nextInt();

        boolean isGradeMoreThanOrEqualTo60 = grade >= 60;

        if(isGradeMoreThanOrEqualTo60 == true){
            System.out.println("Awesome! So, you have passed this math exam!");
        }
    }
}
