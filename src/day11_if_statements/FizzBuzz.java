package day11_if_statements;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.println("Print a number: ");
        int num = key.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 5 == 0) {
            System.out.println("Bizz");
        } else if (num % 3 == 0) {
            System.out.println("Fizz");
        }

    }
}
