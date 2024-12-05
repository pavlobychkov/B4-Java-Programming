package day21_arrays;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {

        double [] arr1 = new double[4];

        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1.length);
        System.out.println(arr1[0]);
        arr1[0] = 30.99;
        System.out.println(Arrays.toString(arr1));

        System.out.println();
        double price = 20.99;
        int quantity = 5;

        System.out.println(arr1[arr1.length - 1]);
        arr1[arr1.length - 1] = price * quantity;
        System.out.println(Arrays.toString(arr1));

        arr1[arr1.length - 1] = 10.99;
        System.out.println(Arrays.toString(arr1));
    }
}
