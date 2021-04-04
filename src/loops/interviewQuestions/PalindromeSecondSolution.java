package loops.interviewQuestions;

public class PalindromeSecondSolution {
    public static void main(String[] args) {
        String name = "Kayak".toLowerCase().trim();

        boolean isPalindrome = true;

        for (int i = 0; i <= name.length()/2; i++) {
            if(name.charAt(i) != name.charAt(name.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
