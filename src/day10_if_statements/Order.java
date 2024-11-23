package day10_if_statements;

import java.util.Scanner;

public class Order {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a product name: ");
        String product = obj.nextLine();

        System.out.print("Please, enter the price: $");
        double price = obj.nextDouble();

        System.out.print("Please, tell us quantity: ");
        int quantity = obj.nextInt();

        obj.nextLine();

        System.out.print("Enter your full name, please: ");
        String name = obj.nextLine();


       //System.out.println("Full name: " + name, "\nYour order: " + product + "\nQuantity: " +
               // quantity + "\nYour total amount is: $");
    }
}
