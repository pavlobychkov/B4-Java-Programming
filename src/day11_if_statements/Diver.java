package day11_if_statements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Diver {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Whats you oxygen level? ");
        int oxygenLevel = key.nextInt();
        oxygenLevel = 80;



        if (oxygenLevel >= 50 &&  oxygenLevel < 60) {
            System.out.println("Be carefull now you are at 50%");
        } else if (oxygenLevel >= 60 && oxygenLevel <= 70) {
            System.out.println("Start to headback");
        } else if (oxygenLevel >= 70) {
            System.out.println("Don't go too far");
        } else if (oxygenLevel >= 80) {
            System.out.println("Still okay");
        } else if (oxygenLevel >= 90) {
            System.out.println("Your tank is full");
        } else {
            System.out.println("run");
        }




    }
}
