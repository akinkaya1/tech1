package loops.forLoop;

public class CountCharacters {
    public static void main(String[] args) {
        /**
         Write a Java program to count total number of “o” letter in the given String below:

         String str = “TechGlobal School”;

         Expected output:
         3
         */

        String str = "TechGlObal SchOOl".toLowerCase().trim();

        if(str.isEmpty() || !str.contains("o")){
            System.out.println("This string does not contain letter o");
        }
        else{
            int counter = 0;

            for (int i = 0; i <= str.length()-1; i++) {
                if(str.charAt(i) == 'o'){
                    counter++;
                }
            }
            System.out.println(counter);
        }

    }
}
