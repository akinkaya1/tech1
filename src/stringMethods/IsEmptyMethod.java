package stringMethods;

public class IsEmptyMethod {
    public static void main(String[] args) {
        String name = "Lionel";
        System.out.println(name.isEmpty()); // false

        name = "";

        System.out.println(name.isEmpty()); // true
    }
}
