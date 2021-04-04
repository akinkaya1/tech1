package stringMethods;

public class TrimMethod {
    public static void main(String[] args) {
        String str1 = "               TechGlobal  ";
        System.out.println(str1);
        System.out.println(str1.trim());

        System.out.println();
        System.out.println("The length before the trim: " + str1.length());

        String str2 = str1.trim(); // "TechGlobal"
        System.out.println("The length after the trim: " + str2.length()); // 10

    }
}
