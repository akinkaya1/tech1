package stackAndHeap;

public class StringPool {
    public static void main(String[] args) {
        String name = "Lionel";

        name = "Alex";

        String s = name.toUpperCase(); // ALEX

        s = name; // Alex

        System.out.println(s == name); // true  String@1233hb4 == String@1233hb4

        //Creating String with new keyword
        String address1 = new String("Chicago");
        String address2 = new String("Chicago");

        System.out.println(new String("Lionel"));

        System.out.println(address1);
        System.out.println(address2);

        System.out.println(address1.equals(address2)); // true  Chicago = Chicago

        String name2 = "Lionel";
        String name3 = "Lionel";
        String name4 = "Max";
    }
}
