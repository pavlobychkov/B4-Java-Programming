package day12_switch_statesments;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("What day do you want to know about?: ");
        String day = key.next();
        String info;
        switch (day) {
            case "Monday":
                info = "We have mentor sessions on Mondays!";
                break;
            case "Tuesday":
                info = "We dont have a class!";
                break;
            case "Wednesday":
                info = "Beautiful day!";
                break;
            case "Thursday":
                info = "Beautiful DAAAAAY";
                break;
            case "Friday":
                info = "We do not have a class!";
                        break;
            case "Saturday":
                info = "Awesome";
                break;
            case "Sunday":
                info = "Perfect";
                break;
            default:
                info = "No valid input!";
        }

        System.out.println(info);
    }
}
