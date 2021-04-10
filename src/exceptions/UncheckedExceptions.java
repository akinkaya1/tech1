package exceptions;

public class UncheckedExceptions {
    public static void main(String[] args) {

        try{
            String s = "Lionel";
            System.out.println(s.charAt(100)); // i
        }
        catch (Exception e){
            System.out.println("String index out of bound exception is caught");
            System.out.println("And the message of error is: " + e.getMessage());
            System.out.println("Try something else!!!");
        }

        System.out.println("More code in between");

      try{
          int[] numbers = {1, 2, 3};

          System.out.println("Fifth element of array is = " + numbers[4]); // exception
      }
      catch (Exception e){
          System.out.println("Array index out of bound exception is caught!!!");
          System.out.println("Error message is: " + e.getMessage());
          System.out.println("Try something else!!!");
      }

        System.out.println("More code to execute is here!!!!");
        System.out.println("End of the program");
    }
}
