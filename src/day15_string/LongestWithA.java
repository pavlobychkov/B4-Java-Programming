package day15_string;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);


        System.out.println("Please enter 3 different words: ");
        String word1 = word.next();
        String word2 = word.next();
        String word3 = word.next();

        boolean isFirstLongestA = word1.contains("a") && word1.length() > word2.length() && word1.length() > word3.length();
        boolean isSecondLongestA = word2.contains("a") && word2.length() > word1.length() && word2.length() > word3.length();
        boolean isThirdLongestA = word3.contains("a") && word3.length() > word2.length() && word3.length() > word1.length();

        if (isFirstLongestA) {
            System.out.println(word1.toUpperCase() + " is longest with a");
        } else if (isSecondLongestA){
            System.out.println(word2.toUpperCase() + " is longest with a");
        } else if (isThirdLongestA) {
            System.out.println(word2.toUpperCase() + " is longest with a");
        }

    }
}
