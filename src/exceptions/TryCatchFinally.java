package exceptions;

public class TryCatchFinally {
    public static void main(String[] args) {

        try {
            String name = "Lionel";
            System.out.println(name.charAt(10));
        }
        catch (Exception e){
            System.out.println("Exception message is: " + e.getMessage());
        }
        finally{
            System.out.println("Final code");
        }

        System.out.println("End of the program");
    }
}
