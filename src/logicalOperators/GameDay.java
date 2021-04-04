package logicalOperators;

public class GameDay {
    public static void main(String[] args) {
        boolean isSunny = false;
        boolean isWeekend = true;
        boolean isThereAGame = true;
        boolean result = isSunny && isThereAGame || isWeekend;

        System.out.println(result);
    }
}
