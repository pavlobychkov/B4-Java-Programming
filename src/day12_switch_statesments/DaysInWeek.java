package day12_switch_statesments;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int numInWeek;
        String day;

        System.out.println("Please, enter a day in num that represents a week day: ");
        numInWeek = key.nextInt();

        switch (numInWeek) {
            case 1:
               day = "Monday";
               break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Not valid num day in week";
        }

        System.out.println(day);

    }
}
