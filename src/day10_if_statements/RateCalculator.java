package day10_if_statements;

import java.util.Scanner;

public class RateCalculator {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        double salary;
        int hoursWeek;
        double hourlyRate;

        System.out.print("Enter your, annual salary: $");
        salary = key.nextDouble();

        System.out.print("How many hours you work in a week: ");
        hoursWeek = key.nextInt();

        hourlyRate = salary / (hoursWeek * 52);
        System.out.println("Your annual salary is $" + salary + "\n\tWork hours per week: " +
                hoursWeek + "\n\tHourly rate $" + hourlyRate);








    }
}
