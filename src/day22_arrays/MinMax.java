package day22_arrays;

public class MinMax {
    public static void main(String[] args) {
        int[] nums = {500, -80, 90, 250, -10};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int eachElem : nums){

            if (eachElem > max) {
                max = eachElem;
            }

            if (eachElem < min){
                min = eachElem;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
