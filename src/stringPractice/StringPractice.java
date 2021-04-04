package stringPractice;

public class StringPractice {
    public static void main(String[] args) {

        String companyName = "TechGlobal";

        int age = 45;
        char c = 'A';
        System.out.println(age); //45
        System.out.println(companyName); //TechGlobal


        String number = age + "";
        String character = c + "";

        System.out.println("Number is " + number); //Number is 45
        System.out.println("Character is " + character);


        String myAddress; // declaration

        myAddress = "2860 S River Rd, Suite 350 Des Plaines IL"; // assignment

        String myHomeAddress = "okay, let's do this"; //declaration + assignment

        System.out.println(myAddress);
        System.out.println(myHomeAddress);
    }
}
