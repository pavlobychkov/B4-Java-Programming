package day09_a_scanner;

import java.util.Scanner;

public class UsingNextLine {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.println("What day is today? ");
        String day = key.nextLine();

        System.out.println("Enter your first name: ");
        String firstName = key.next();

        System.out.println("Enter your last name: ");
        String lastName = key.next();
        key.nextLine();

        System.out.println("Enter you address: ");
        String address = key.nextLine();

        System.out.println("Please, enter Job Title: ");
        String jobTitle = key.nextLine();




    }
}
