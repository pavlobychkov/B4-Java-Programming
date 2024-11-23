package day09_a_scanner;

import java.util.Scanner;

public class WorkStatus {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter your first name: ");
        String firstName = key.next();
        System.out.print("Please, enter your last name: ");
        String lastName = key.next();

        System.out.print("Are you employed (true/false): ");
        boolean isEmployed = key.nextBoolean();
        System.out.println(firstName + " - " + lastName + " - " + isEmployed);

        System.out.print("Are you a student (true/false): ");
        boolean isStudent = key.nextBoolean();

        System.out.println("Information about " + firstName + " " + lastName);
        System.out.println("\tIs Employed: " + isEmployed);
        System.out.println("\tIs Student: " + isStudent);

    }
}
