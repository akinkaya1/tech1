package stringMethods;

public class ReplaceMethod {
    public static void main(String[] args) {
        String str = "blue, green, white";

        System.out.println(str.replace("blue", "yellow")); // yellow, green, white



        String str2 = "banana"; // replace a with u

        String str2WithoutA = str2.replace('a', 'u');

        System.out.println(str2WithoutA);

    }
}
