package day17_loops;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int validPin = 7777;
        int userEnterPin;
        int attemptCount = 1;

        System.out.println("          WELCOME TO ATM              ");
        System.out.println();
    do {
        System.out.print("Please, enter pin: ");
        userEnterPin = key.nextInt();
        attemptCount++;
    } while (userEnterPin != validPin && attemptCount <= 3);


    if (attemptCount > 3 && userEnterPin != validPin) {
        System.out.println("You are locked out. ");
    }
    }
}
