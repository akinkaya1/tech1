package stringPractice;

public class StringConcatenation {
    /*
    TASK-1
    PSEUDO CODE
    -call main() method
    -create 3 different strings and assign given values
    -create another string to concatenate first 3 strings // use + operator for concatenation
    -print them out

    String wordPart1 = “le”;
    String wordPart2 = “ar”;
    String wordPart3 = “ning”;
    NOTE: Use “+” operator for concatenation

    TASK-2
    PSEUDO CODE
    -call main() method
    -create 2 different strings and assign given values
    -create another string to concatenate first 2 strings // use concat() for concatenation
    -print them out
    String sentencePart1 = “I can”;
    String sentencePart2 = “learn Java”;
    NOTE: Use concat() method for concatenation

     */

    public static void main(String[] args) {
        //TASK-1
        String wordPart1 = "le";
        String wordPart2 = "ar";
        String wordPart3 = "ning";

        String word = wordPart1 + wordPart2 + wordPart3;

        System.out.println("My word is: " + word);

        //TASK-2
        String sentencePart1 = "I can";
        String sentencePart2 = "learn Java";

        String sentence = sentencePart1.concat(" ".concat(sentencePart2));
        System.out.println(sentence);
    }
}
