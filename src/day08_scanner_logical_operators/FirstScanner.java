package day08_scanner_logical_operators;

import java.util.Scanner;

public class FirstScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How old are you? ");

        int userAge = input.nextInt();

        System.out.println("I amd " + userAge + " years old.");


    }
}
