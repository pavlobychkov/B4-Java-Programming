package day10_if_statements;

import java.util.Scanner;

public class Biggest {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.println("Please, enter 3 numbers: ");
        int num1 = key.nextInt();
        int num2 = key.nextInt();
        int num3 = key.nextInt();

        //System.out.println("num1 = " + num1);
        //System.out.println("num2 = " + num2);
       //System.out.println("num3 = " + num3);

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is biggerst.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is biggest.");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " is biggest.");
        } else {
            System.out.println("All same");
        }
    }
}
