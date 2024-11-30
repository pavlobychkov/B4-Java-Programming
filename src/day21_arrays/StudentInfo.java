package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {

        String [] student1 = {"ID#B#4#1", "Tom", "Jerry", "B#4"};
        System.out.println(Arrays.toString(student1));

        System.out.println("----------------------------");

        String  [] student2 = new String [4];
        student2 [1] = "Winnie";
        student2 [0] = "ID#B#4#2";
        student2 [2] = "Pooh";
        student2 [3] = "B#4";
        System.out.println(Arrays.toString(student2));

        System.out.println("------------------------------");
        String [] student3 = new String[4];
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter ID: ");
        student3 [0] = key.nextLine();
        System.out.print("Please, enter a first name: ");
        student3 [1] = key.nextLine();
        System.out.print("Please, enter last name: ");
        student3 [2] = key.nextLine();
        System.out.print("Please, enter batch number: ");
        student3 [3] = key.nextLine();
        System.out.println(Arrays.toString(student3));

        System.out.println("-----------------------------");
        String [] questions = {"Please, enter ID: ", "First: ", "Last: ", "Batch: "};
        String [] studemt4 = new String[4];

        for (int i = 0; i < questions.length; i++) {
            System.out.println(i);
            studemt4 [i] = key.nextLine();
        }
        System.out.println(Arrays.toString(studemt4));

    }
}
