package loops.interviewQuestions;

public class ReverseAString {
    public static void main(String[] args) {
        String s = "TechGlobal";

        System.out.println("\nLOOP IS RUNNING\n");
        for (int i = s.length()-1; i >= 0 ; i--) {
            System.out.print(s.charAt(i));
        }


    }
}
