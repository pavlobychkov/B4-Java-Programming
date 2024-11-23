package day09_a_scanner;


import java.util.Scanner;
public class DivisibleBy {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = key.nextInt();
        System.out.println(num + " is divisible by 2: " + (num % 2 == 0));
        System.out.println(num + " is divisible by 3: " + (num % 3 == 0));
        System.out.println(num + " is divisible by 5: " + (num % 5 == 0));

        System.out.println(num + " is divisible by 2 and 3 and 5: ");

    }
}
