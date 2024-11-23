package day09_a_scanner;

public class Discount {

    public static void main(String[] args) {

        boolean isWeekend = true, isTeacher = false, isOfficcer = true, isFireFighter = false;
        boolean isEligibleForDiscount = isWeekend && (isTeacher || isOfficcer || isFireFighter);

        System.out.println("Is eligible for discount: " + isEligibleForDiscount);


    }
}
