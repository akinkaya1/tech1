package innerClass;

public class Table { // outer class

    public static class CoffeeTable{ // inner class

        public void infoOfCoffeeTable(){
            System.out.println("Hello, I am coffee table!");
        }

        public static class DifferentCoffeeTable{

        }
    }


    public static class ConsoleTable{
        public static void infoOfConsoleTable(){
            System.out.println("Hello, I am console table!");
        }
    }
}
