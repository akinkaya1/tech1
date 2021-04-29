package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecapArrayList {
    public static void main(String[] args) {
        /*
        Create an ArrayList of countries
        And add below countries
        Print your ArrayList
        Countries: Spain, USA, Argentina

        NOTE: you can put those into an array and put Array into ArrayList
         */

        //First way - using add() method
        ArrayList<String> countries1 = new ArrayList<>();
        countries1.add("Spain");
        countries1.add("USA");
        countries1.add("Argentina");
        System.out.println("Countries 1 : " + countries1);

        //Second way - using array and Arrays.asList() method
        String[] countries2 = {"Ukraine", "Turkey", "Poland"};
        List<String> countries2AsList = new ArrayList<>(Arrays.asList(countries2));
        System.out.println("Countries 2 : " + countries2AsList);

        //Third way - using loop
        String[] countries3 = {"Ukraine", "Turkey", "Poland", "Brasilia", "Italy"};
        List<String> countries3AsList = new ArrayList<>();

        for (String country: countries3) {
            countries3AsList.add(country);
        }

        System.out.println("Countries 3 : " + countries3AsList);
    }
}
