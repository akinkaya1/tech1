package stringMethods.practice;


public class ComparingTwoStrings {
    public static void main(String[] args) {
        String str1 = "TechGlobal";
        String str2 = "TECHglobal";

        //Can you write 3 statements that will return those 2 strings to be equal
        String str1AllLowerCase = str1.toLowerCase(); //techglobal
        String str2AllLowerCase = str2.toLowerCase(); //techglobal

        String str1AllUpperCase = str1.toUpperCase(); //TECHGLOBAL
        String str2AllUpperCase = str2.toUpperCase(); //TECHGLOBAL

        System.out.println(str1.equalsIgnoreCase(str2)); //true
        System.out.println(str1AllLowerCase.equals(str2AllLowerCase)); //true
        System.out.println(str1AllUpperCase.equals(str2AllUpperCase)); //true
    }
}
