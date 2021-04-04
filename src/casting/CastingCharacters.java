package casting;

public class CastingCharacters {
    public static void main(String[] args) {
        char c = 'T';
        // t -> 116
        // T -> 84
        // TechGlobal

        int sum = 'T' + 'e' + 'c' + 'h' + 'G' + 'l' + 'o' + 'b' + 'a' + 'l';
        System.out.println("Decimal value of characters in TechGlobal from ASCII table: " + sum);

        int i = c;
        System.out.println(i); //decimal value of $ from ASCII table

        char character = 3021; //A

        System.out.println(character);
    }
}
