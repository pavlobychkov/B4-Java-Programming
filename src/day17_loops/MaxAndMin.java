package day17_loops;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("How many number do you want to compare?: ");
        int countOfNum = key.nextInt();
        int cycle = 1;
        int userNum;

        int biggest = -2147483648;
        int smallest = 2147483647;


        while (cycle <= countOfNum) {
            System.out.print("Please, enter the number " + cycle + ": ");
            userNum = key.nextInt();

            if (userNum > biggest) {
                biggest = userNum;
            }

            if (userNum < smallest) {
                smallest = userNum;
            }

            cycle++;
        }

        System.out.println("Biggest: " + biggest);
        System.out.println("Smallest: " + smallest);

    }
}
