package day10_if_statements;

import java.util.Scanner;

public class DaysInMonths {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number between 1 and 12 inclusive which represents" +
                "each month: ");
        int month = input.nextInt();

        boolean has31Days = month == 1 || month == 3 || month ==5 || month == 7 || month == 8 || month == 10 || month == 12;
        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;
        boolean has28Days = month == 2;

        if (has31Days) {
            System.out.println("Month has 31 days");
        } else if (has30Days) {
            System.out.println("Month has 30 days");
        } else if (has28Days){
            System.out.println("Month has 28 days");
        } else {
            System.out.println("The number you given us is not in range 1 to 12\n\tYour number is " + month);
        }


        }
    }

