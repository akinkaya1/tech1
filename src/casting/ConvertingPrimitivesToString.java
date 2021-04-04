package casting;

public class ConvertingPrimitivesToString {
    public static void main(String[] args) {

        int number = 125;
        String s = "125";

        System.out.println("integer value: " + (number + number)); //250
        System.out.println("String value: " + (s + s)); //125125

        boolean b = true;
        String s2 = b + ""; //true
        System.out.println("S2 is: " + s2);
        String s1 = number +  ""; //125

        if(b){
            System.out.println("This is for true");
        }
        else{
            System.out.println("This is for false");
        }

    }
}
