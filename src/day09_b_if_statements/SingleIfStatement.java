package day09_b_if_statements;

public class SingleIfStatement {

    public static void main(String[] args) {

        if (true) {

            System.out.println("1st print statement");
        }
        if (false) {
            System.out.println("2nd print statement");
        }
        int score = 75;
        if (score>=75) {
            System.out.println("You pass the exam");
        }
        if (score <= 75) {
            System.out.println("You fail the exam");
        }
        System.out.println("------------------");
        int year = 2028;
        boolean isCovidYear = year == 2019 || year == 2020 || year == 2021;
        if (isCovidYear) {
            System.out.println(year + " was a covid quarantine year.");
        }
        if (!isCovidYear) {
            System.out.println("It is not a covid year.Go out and enjoy.");
        }
        if (isCovidYear == false) {
            System.out.println("It is not a covid year.Go out and enjoy.");
        }



    }
}
