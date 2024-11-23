package day09_a_scanner;

import java.util.Scanner;

public class YourInfo {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("Please, enter you favourite book: ");
        String book = key.nextLine();
        System.out.println(book);

        System.out.print("Please, enter your age: ");
        byte age = key.nextByte();
        System.out.println("Please, enter your favorite long number: ");
        long num = key.nextLong();

        System.out.println("\nInfo you entered: ");
        System.out.println("\t" + book);
        System.out.println("\t" + age);
        System.out.println("\t" + num);

    }
}
