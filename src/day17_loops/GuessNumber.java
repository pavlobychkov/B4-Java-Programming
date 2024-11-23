package day17_loops;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int secretNumber = 777;
        int userGuess;

        do {
            System.out.print("Please, guess the number: ");
            userGuess = key.nextInt();

            if (userGuess < secretNumber) {
                System.out.println("It is too low");
            } else if (userGuess > secretNumber) {
                System.out.println("It is too high");
            }
        } while (userGuess != secretNumber);

        System.out.println();

        System.out.println("                !!!CORRECT!!!");
    }
}
