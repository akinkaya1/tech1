package arithmeticOperators;

import org.w3c.dom.ls.LSOutput;

public class CalculateSalary {
    /*
    Exercise
    An annual average salary for an SDET in the Unites States is 90k.
    Write a Java program that calculates and prints the monthly and bi-weekly and weekly average amount
    that an SDET makes in the United States.

    NOTE: Write the pseudo code first
    Annual average salary = $90,000.00
    1 year = 12 months
    1 year = 52 weeks
    Biweekly = every other week = 26 payments

    PSEUDO CODE
    1. I will store my average salary in double
    2. I will find my monthly payment by this formula => 90000/12
    3. I will find my weekly payment by this formula => 90000/52
    4. I will find my biweekly payment by this formula => 90000/26
    5.Print results
     */
    public static void main(String[] args) {

        double averageSalary = 90_000.00;

        double monthlyPayment = averageSalary / 12;

        double biweeklyPayment = averageSalary / 26;

        double weeklyPayment = averageSalary / 52;

        System.out.println("Monthly payment is: " + monthlyPayment
                            + "\nBiweekly payment is: " + biweeklyPayment
                            + "\nWeekly payment is: " + weeklyPayment);
    }

}
