package arrays;

import java.util.Arrays;

public class DefaultValuesOfArrayElements {
    public static void main(String[] args) {
        String[] cities = new String[10];
        System.out.println("String array " + Arrays.toString(cities));

        int[] numbers = new int[10];
        System.out.println("int array " + Arrays.toString(numbers));

        boolean[] b = new boolean[5];
        System.out.println("boolean array " + Arrays.toString(b));

        double[] d = new double[10];
        System.out.println("double array " + Arrays.toString(d));

        float[] f = new float[10];
        System.out.println("float array " + Arrays.toString(f));

        char[] c = new char[10];
        System.out.println("float array " + Arrays.toString(c));

        byte[] b1 = new byte[10];
        System.out.println("byte array " + Arrays.toString(b1));
    }
}
