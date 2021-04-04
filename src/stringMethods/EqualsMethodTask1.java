package stringMethods;

public class EqualsMethodTask1 {
    /*
    Write a program that checks if those 2 strings are equal or not
    If they are equal, print message "s1 and s2 are equal"
    if they are not equal, print message "s1 and s2 are not equal"
     */
    public static void main(String[] args) {
        String s1 = "appium";
        String s2 = "appium";

        //1st way to do it
        if(s1.equals(s2)){
            System.out.println("s1 and s2 are equal");
        }
        else{
            System.out.println("s1 and s2 are not equal");
        }

        //2nd way to do it
        s1.equals(s2); // either true or false
        boolean equal = s1.equals(s2);

        if(equal){
            System.out.println("s1 and s2 are equal");
        }
        else{
            System.out.println("s1 and s2 are not equal");
        }

        System.out.println("\nEnd of the program");
    }
}
