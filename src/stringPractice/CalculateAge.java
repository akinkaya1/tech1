package stringPractice;

public class CalculateAge {
    /*
    David is 25 years old in 2021
    How old David is going to be by 2028

    Future age = 32
     */

    public static void main(String[] args) {
        int age = 25;
        int currentYear = 2021;
        int futureYear = 2028;

        System.out.println("David's age in 2021 is = " + age);

        age = age + (futureYear - currentYear);

        System.out.println("David's future age in 2028 will be = " + age);
    }
}
