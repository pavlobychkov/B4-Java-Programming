package day14_string;

import java.util.Scanner;

public class Webpage {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a website: ");
        String webpage = key.next().toLowerCase();

        boolean isValidBeginning = webpage.startsWith("www");
        //System.out.println(isValidBeginning);

        boolean isValidEnd = webpage.endsWith(".com") || webpage.endsWith(".edu") || webpage.endsWith(".gov");

        if (isValidBeginning && isValidEnd) {
            System.out.println("It is valid website");
        } else {
            System.out.println("It is not valid webpage");

            if (!isValidBeginning) {
                System.out.println("\tInvalid beginning");
            }

            if (!isValidEnd) {
                System.out.println("\tInvalid ending");
            }
        }

    }
}
