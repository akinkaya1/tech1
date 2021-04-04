package casting.practice;

public class CastingInRealLifeExample {
    /*
    Assume David is going to save  $390 to buy a bicycle.
    David is able to save only $15.60 per day.
    How many days later, David can save $390 and buy the bicycle.
    Requirement:Write a java program to solve this problem given above
    Expected Output:25
     */

    public static void main(String[] args) {
        float amountToSaveForBicycle = 390;
        float amountCanBeSavedPerDay = 15.6F;

        long totalDaysToSave = (long) (amountToSaveForBicycle / amountCanBeSavedPerDay);

        System.out.println("David can save this money in " + totalDaysToSave + " days");
    }
}
