package day27_wrapper_arraylist;

import java.util.Arrays;

public class AddElementInArr1 {
    public static void main(String[] args) {

        int [] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(a));

        int [] b = addElemInArr(a, 6);
        System.out.println(Arrays.toString(b));

        System.out.println(Arrays.toString(addElemInArr(b,900)));
        System.out.println(Arrays.toString(addElemInArr(b,25)));
        System.out.println(Arrays.toString(addElemInArr(b, 0)));

        int [] c = addElemInArr(b, 7);
        System.out.println(Arrays.toString(c));

        int [] d = addElemInArr(c, 8);
        System.out.println(Arrays.toString(d));

    }

    public static int [] addElemInArr (int [] arr, int num){


        int [] addedArr = Arrays.copyOf(arr, arr.length +1);
        addedArr [addedArr.length - 1] = num;



        return addedArr;
    }
}


