package stringMethods;

public class ContainsMethod {
    public static void main(String[] args) {
        /*
        Example
        Check if my list has grapes or not
        if it contains grapes, print "This list has grapes"
        if it does not, print "This list does not have grapes
         */

        String shoppingList = "ApplE, BanaNa, oraNGe, strawBERry";

        String newList = shoppingList.toLowerCase(); // apple, banana, orange, strawberry

        boolean checkList = newList.contains("grapes"); // boolean

        if(checkList){
            System.out.println("This list has grapes");
        }
        else{
            System.out.println("This list does not have grapes");
        }



    }
}
