package day11_if_statements;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int expPin = 2222;
        double balance = 100_000.00;


        System.out.print("Welcome to ATM\n\tPlease, insert your card.\n\tPlease, enter your pincode: ");
        int actualPin = key.nextInt();

        if (actualPin == expPin) {
            System.out.println("\n\tYou are logged in. ");
            System.out.println("\tSelect one of the options below: ");
            System.out.println("\t\t1) - check balance");
            System.out.println("\t\t2) - Deposit");
            System.out.println("\t\t3) - Withdraw");
            System.out.println("\t\t4) - Cancel");
            System.out.println("\t\tYour choice (1-4): ");
            int userChoice = key.nextInt();

            if (userChoice == 1) {
                System.out.println("\n\t\tYour balance is: " + balance);
            } else if (userChoice == 2){
                System.out.println("Please, insert your cash...$");
                double depMon = key.nextDouble();
                balance += depMon;
                System.out.println("\t\tAfter dposit, your new balance is $" + balance);
            } else if (userChoice ==3) {
                System.out.println("\n\t\tPlease, enter the amount you want to withdraw...$");
                double withMon = key.nextDouble();
                balance -= withMon;
            } else if (userChoice == 4){
                System.out.println("\n\t\tInvalid option");
            }

        } else {
            System.out.println("Invalid pincode. Go home and try to remeber your pincode.");
        }

    }
}
