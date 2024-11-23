package day09_a_scanner;

import java.util.Scanner;

public class Revenue {

    public static void main(String[] args) {

        //import java.util.Scanner;
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter the price of the item: $");
        double price = input.nextDouble();
        System.out.println("You entered: " + price);
        System.out.print("Please, enter the quantity of the item: $");
        int quantity = input.nextInt();
        double revenue = price + quantity;

        System.out.println("The revenue of the sale is: $" + revenue);


    }
}
