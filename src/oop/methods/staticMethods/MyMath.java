package oop.methods.staticMethods;


public class MyMath {
    public static int subtract(int a, int b){
        return a - b;
    }

    /*
    Create a static method that takes 2 integers and return remainder of those
    int a, int b
    return a % b
     */

    public static int findRemainder(int a, int b){
        return a % b;
    }

    public static void main(String[] args) {
        System.out.println(MyMath.subtract(12, 9));; // 3
        System.out.println(MyMath.findRemainder(34, 30)); // 4
    }
}

