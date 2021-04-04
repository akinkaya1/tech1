package stringMethods.practice;

public class FindMyFruits {
    public static void main(String[] args) {
        /*
        Find what fruit I will buy first
        and what fruit I will buy last
         */
        String shopping = "I will buy bananas, apples and oranges today!";

        int indexOfBananas = shopping.indexOf("bananas"); // 11
        int indexOfApples = shopping.indexOf("apples"); // 20
        int indexOfOranges = shopping.indexOf("oranges"); // 31

        System.out.println("The index of \"bananas\" is: " + indexOfBananas);
        System.out.println("The index of \"apples\" is: " + indexOfApples);
        System.out.println("The index of \"oranges\" is: " + indexOfOranges);


        if(indexOfBananas < indexOfApples && indexOfBananas < indexOfOranges){
            System.out.println("The first is bananas");
        }
        else if(indexOfApples < indexOfBananas && indexOfApples < indexOfOranges){
            System.out.println("The first is apples");
        }
        else {
            System.out.println("The first is oranges");
        }

        if(indexOfBananas > indexOfApples && indexOfBananas > indexOfOranges){
            System.out.println("The last is bananas");
        }
        else if(indexOfApples > indexOfBananas && indexOfApples > indexOfOranges){
            System.out.println("The last is apples");
        }
        else{
            System.out.println("The last is oranges");
        }


    }
}
