package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsingCollectionsClass {
    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 2, 4, 62, 23,9));

        Collections.sort(list1);
        System.out.println("Sort: " + list1);

        Collections.reverse(list1);
        System.out.println("Reversed: " + list1);

        System.out.println(Collections.max(list1));
        int minList = Collections.min(list1);
        System.out.println(minList);

        Collections.swap(list1, 1, list1.size()-1);
        System.out.println("Swap: " + list1);

        String str = "loopcamp";
        ArrayList <String> letterList = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(letterList);

        int numOfLetterO = Collections.frequency(letterList, "o");
        System.out.println(numOfLetterO);
        System.out.println(Collections.frequency(letterList, "p"));
        System.out.println(Collections.frequency(letterList, "a"));
        System.out.println("-----------------------");

        System.out.println(Collections.frequency(list1, 100));
        System.out.println(Collections.frequency(list1, 9));


    }
}
