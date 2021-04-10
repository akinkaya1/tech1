package exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class MultipleCatchBlocks {
    public static void main(String[] args) {

        try{
            String s = "TechGlobal";
            int[] nums = {1,2};

            System.out.println(s.charAt(1));

            System.out.println(nums[5]);
        }
        catch (StringIndexOutOfBoundsException s){
            System.out.println("String Exception caught: " + s.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException i){
            System.out.println("Array Exception caught: " + i.getMessage());
        }
        catch (Exception e){
            System.out.println("Exception is caught!");
        }


        System.out.println("End of the program");
    }
}
