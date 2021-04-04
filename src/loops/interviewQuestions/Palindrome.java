package loops.interviewQuestions;

public class Palindrome {
    public static void main(String[] args) {
        String name = "Kayak";
        // TechGlobal is equal to labolGhceT

        String reversedName = "";

        for (int i = name.length()-1; i >= 0 ; i--) {
            reversedName += name.charAt(i); // kayaK
        }

        System.out.println("Reversed name = " + reversedName);

        // Kayak kayaK
        if(name.trim().equalsIgnoreCase(reversedName.trim())) System.out.println("Palindrome");
        else System.out.println("Not palindrome");

    }
}
