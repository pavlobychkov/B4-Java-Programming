package day12_switch_statesments;

import java.util.Scanner;

public class FieldTrip {

    public static void main(String[] args) {

        int grade;
        String teacher, location;
        int numOfGroups;
        Scanner key = new Scanner(System.in);
        System.out.print("What is the grade you want to get a field trip info: ");
        grade = key.nextInt();

        if (grade >= 1 && grade <= 6) {
            teacher = "Mr Nadir";
            location = "Apple Orchard";
            numOfGroups = 10;
        } else if (grade == 2) {
                teacher = "Ms. Jessica";
                location = "Zoo";
                numOfGroups = 4;
        } else if (grade == 3) {
            teacher = "Mr Casey";
            location = "Museum";
            numOfGroups = 7;
        } else if (grade == 4) {
            teacher = "Jerry";
            location = "Aquarium";
            numOfGroups = 5;
        } else if (grade == 5) {
            teacher = "Mr Winnie";
            location = "Disneyland";
            numOfGroups = 2;
        } else {
            teacher = "Pooh";
            location = "Cinema";
            numOfGroups = 1;
        }


        System.out.println("\nHere is field trip info " + grade);
        System.out.println("\tTeacher name: " + teacher);
        System.out.println("\tLocation: " + location);
        System.out.println("\tNumber of grops: " + numOfGroups);


    }
}
