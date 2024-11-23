package day15_string;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter your first name: ");
        String firstName = key.next().toUpperCase();
        System.out.print("Please, enter your last name: ");
        String lastName = key.next().toUpperCase();

        char firstCharOfFirstName = firstName.charAt(0);
        char firstCharOflastName = lastName.charAt(0);

        System.out.println("" + firstCharOfFirstName + firstCharOflastName);
    }
}
