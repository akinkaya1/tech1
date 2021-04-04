package loops.interviewQuestions;

public class FizzBazz {
    /**
     Write a program to print all numbers from 1 to 17 BUT
     •Print “fizz” if the number is divided by 3 instead of number itself
     •Print “bazz” if the number is divided by 5 instead of number itself
     •Print “fizzbazz” if the number is divided by both 3 and 5 instead of number itself
     */
    public static void main(String[] args) {

        for (int i = 1; i <= 17 ; i++) {

            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("fizzbazz");
            }
            else if(i % 3 == 0) {
                System.out.println("fizz");
            }
            else if(i % 5 == 0) {
                System.out.println("bazz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
