package day10_if_statements;

import java.util.Scanner;

public class DaysOfWeek {

    public static void main(String[] args) {

        Scanner key= new Scanner(System.in);

        System.out.println("Please enter a number between 1 - 7 inclusive: ");
        int weekDay = key.nextInt();

        boolean isMonday = weekDay == 1;

        if (isMonday) {
            System.out.println("Monday");
        }
        if (weekDay == 2) {
            System.out.println("Tuesday");
        }
        if (weekDay == 3) {
            System.out.println("Wednesday");
        }
        if (weekDay == 4){
            System.out.println("Thursday");
        }
        if (weekDay == 5) {
            System.out.println("Friday");
        }
        if (weekDay == 6){
            System.out.println("Saturday");
        }
        if (weekDay == 7) {
            System.out.println("Sunday");
        }

        System.out.println("--------------------");


    }

}
