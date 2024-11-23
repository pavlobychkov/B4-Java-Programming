package day13_String;

import javax.swing.*;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        //Scanner key = new Scanner(System.in);

        String name1 = "Micky";
        String name2 = "Micky";
        String name3 = new String("Mickey");

        String word1 = "Monday";
        String word2 = new String("MONDAY");
        System.out.println("Compairing values: " + word1.equalsIgnoreCase(word2));
        String word3 = "Mon";
        System.out.println(word1.equalsIgnoreCase(word3));

        System.out.println("--------------------------------------");

        String school = "loopCamp";
        System.out.println(school);
        System.out.println(school.length());
        int numOfChars = school.length();
        System.out.println("Number of characters: " + numOfChars);


    }
}
