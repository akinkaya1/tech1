package arrays.practiceArrayManipulation;

 public class CountCharacters {
    public static void main(String[] args) {

        String str = "Lionel"; // ignore

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.toLowerCase().charAt(i) == 'l')count++;
        }

        //SECOND WAY

        int counter = 0;
        char[] charsOfStr = str.toCharArray(); // ['L', 'i', 'o',

        for (char c: charsOfStr) {
            if(c == 'l' || c == 'L')  counter++;
        }

        System.out.println("The total number of l: " + count);
        System.out.println("The total number of l: " + counter);

        String names = "Ally, Jennifer, Jessie, Ally ";

        while(!names.isEmpty()){
            System.out.println(names.substring(0, names.indexOf(" ")));
            names = names.replace(names.substring(0, names.indexOf(" ")+1), "");
        }


    }
}
