package day09_b_if_statements;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        double balance;
        double withdraw;

        System.out.print("What is your balance: $");
        int num = key.nextInt();
        balance = num;
        System.out.println("\nYour balance is: $" + balance);

        System.out.println("How much do you want to withdraw? $");
        withdraw = key.nextInt();
        System.out.println("You are requesting to withdraw $" + withdraw);

        balance = balance - withdraw;
        System.out.println("Your new balance is: $" + balance);
        if (withdraw > balance) {
            System.out.println("Not enough money");
        }


    }

}
