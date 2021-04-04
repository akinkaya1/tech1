package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    public static void main(String[] args) {

        // 1. Create an ArrayList named as cars

        List<String> cars = new ArrayList<>();

        // 2. add "BMW", "Tesla" and "Audi" in this list
        cars.add("BMW");
        cars.add("Tesla");
        cars.add("Audi");

        // 3. print your list and see what you have
        System.out.println("Cars list = " + cars);

        /*
        4
        So far, we have
        index 0 = BMW
        index 1 = Tesla
        index 2 = Audi

        NOW, I want you to add Mercedes but in the index of 1
        after that, my list will look like:
        index 0 = BMW
        index 1 = Mercedes
        index 2 = Tesla
        index 3 = Audi
        [BMW, Mercedes, Tesla, Audi]
         */

        cars.add(1,"Mercedes");

        //5. print result again see the new list
        System.out.println("Cars list after adding Mercedes to the index of 1 = " +cars);

        //6. create new ArrayList and named as japanCars
        List<String> japanCars = new ArrayList<>();

        //7. add Honda, Lexus and Toyota to japanCars list
        japanCars.add("Honda");
        japanCars.add("Lexus");
        japanCars.add("Toyota");

        //8. print japanCars list and see the result
        System.out.println("Japan cars = " + japanCars);

        //9. add all Japan cars to cars list
        cars.addAll(japanCars);

        //10. print both lists and see the result
        System.out.println("Cars after adding all Japan cars to cars = " + cars);
        System.out.println("Japan cars = " + japanCars);

        //11. check if your cars list contains Tesla and also Japan cars to contain Lexus

        boolean carsContainsTesla = cars.contains("Tesla");
        boolean japanCarsContainsLexus = japanCars.contains("Lexus");

        System.out.println("Cars contains Tesla = " + carsContainsTesla);
        System.out.println("Japan cars contains Lexus = " + japanCarsContainsLexus);

        //12. remove Tesla and put Volkswagen instead of Tesla
        cars.set(cars.indexOf("Tesla"), "Volkswagen");

        //13. print car list and see what you have
        System.out.println("Cars list after removing Tesla and adding Volkswagen instead = " + cars);

        //14. print size of both lists
        System.out.println("The size of Japan cars list = " + japanCars.size());
        System.out.println("The size of cars list = " + cars.size());

        //15. remove Volkswagen from the cars list
        System.out.println(cars.remove("Volkswagen")); //true
        System.out.println("The cars list after removing Volkswagen = " + cars);


        //16. remove Mercedes from the list by using the index
        System.out.println(cars.remove(cars.indexOf("Mercedes"))); // Mercedes
        System.out.println("The cars list after removing Mercedes = " + cars);

        //17. remove all Japan cars from the cars list
        cars.removeAll(japanCars);

        System.out.println("Cars list after removing all Japan cars = " + cars);
        System.out.println("Japan cars list = " + japanCars);
        System.out.println("The size of Japan cars list = " + japanCars.size()); // 3
        System.out.println("The size of cars list = " + cars.size()); // 2

        //18. remove everything from both lists
        cars.clear();
        japanCars.clear();
    }
}
