package casting.ConvertingStringsToPrimitives;

public class FirstExample {
    public static void main(String[] args) {
        double number = 100; // "125";

        String s = "125 "; // this is not converting

        String str = String.valueOf(number); // this is a string and int number is converted to a String

        String str1 = number + ""; // this is a string and int number is converted to a String

        System.out.println(str1); // 100

        //HOW TO CONVERT STRING INTO PRIMITIVES

        String age = "45";

        //convert age to byte and this can be done with short, int, long, float, double
        byte byteAge1 = Byte.valueOf(age); // 45
        byte byteAge2 = Byte.parseByte(age); // 45
        System.out.println(byteAge1*2); // 90

        double doubleAge = Double.valueOf(age); // 45.0
        float floatAge = Float.parseFloat(age); // 45.0

        //Converting String into boolean
        String check = "true";

        boolean checkBoolean1 = Boolean.valueOf(check); // true
        boolean checkBoolean2 = Boolean.parseBoolean(check);

        System.out.println(checkBoolean1);
        System.out.println(checkBoolean2);

        //Difference between valueOf and parse methods?
        String num = "1000";

        Integer.valueOf(num); // Integer object
        Integer.parseInt(num); // int primitive
    }
}
