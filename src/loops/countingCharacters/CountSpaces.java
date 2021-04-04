package loops.countingCharacters;

public class CountSpaces {
    public static void main(String[] args) {
        String s = "Hello, it is sunny and funny day today";

        int countSpaces = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') countSpaces++;
        }

        System.out.println("The total number of spaces is equal to = " + countSpaces);

        String s1 = "1bH3/#34GH".toLowerCase();

        //1.Find how many digits in this string - 4
        //2.How many letters in this string - 4
        //3. How many special characters in this string - 2

        int countDigits = 0;
        int countLetters = 0;
        int countSpecials = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if((int)c >= 48 && (int)c <= 57) countDigits++;
            else if((int)c >= 97 && (int)c <= 122) countLetters++;
            else{
                countSpecials++;
            }
        }

        System.out.println("The total number of digits = " + countDigits);
        System.out.println("The total number of letters = " + countLetters);
        System.out.println("The total number of others = " + countSpecials);



        char c = 'A';


        if(Character.isDigit(c)) System.out.println("Char is digit");
        else if( Character.isLetter(c)) System.out.println("Char is letter");
        else if(!Character.isLetterOrDigit(c)) System.out.println("Char is not digit or letter");
    }
}
