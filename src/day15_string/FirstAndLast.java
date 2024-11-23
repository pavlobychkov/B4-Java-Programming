package day15_string;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Pleae, enter a sentence: ");
        String sentence = key.nextLine();

        System.out.println(sentence.charAt(0));
        System.out.println(0 + sentence.charAt(0));
        System.out.println(sentence.charAt(sentence.length() - 1));

       // System.out.println("First char: ");
        //System.out.println("Last char: ");

    }
}
