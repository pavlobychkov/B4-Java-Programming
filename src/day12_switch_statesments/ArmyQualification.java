package day12_switch_statesments;

import java.util.Scanner;

public class ArmyQualification {
    public static void main(String[] args) {

        boolean isCitizen;
        boolean isResident;
        boolean hasDiploma;
        int age;

        Scanner key = new Scanner(System.in);
        System.out.println("Welcome to Army Station!");
        System.out.println("Please, answer the following questions to check eligibility\n");
        System.out.print("\tAre you citizen (true/false: ");
        isCitizen = key.nextBoolean();
        System.out.print("\tAre you a resident (True/false): ");
        isResident = key.nextBoolean();
        System.out.print("\tDoyou have a school diploma? (true/false): ");
        hasDiploma = key.nextBoolean();
        System.out.print("\tHow old are you?: ");
        age =  key.nextInt();

        if ((isCitizen || isResident) && hasDiploma && 18 <= age && age <=35) {
            System.out.println("Test");

        } else {

            System.out.println("\n\tYou are not eligible for the following reasons:");
            if (!isCitizen || !isResident)
            System.out.println("\t\tYou must be a citizen or resident");
        }  if (!hasDiploma) {
            System.out.println("\t\tYou must have a high school diploma");
        }

        if (age < 18 || age > 35) {
            System.out.println("Your age must be between 18 to 35 years old");
        }



    }
}
