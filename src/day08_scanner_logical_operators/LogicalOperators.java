package day08_scanner_logical_operators;

public class LogicalOperators {

    public static void main (String [] args){

        int n = 10;

        System.out.println(n > 5);
        System.out.println(n < 20);
        System.out.println(n > 5 && n < 20);
        System.out.println("---------------------");

        System.out.println(6 > 1 || false);
        System.out.println(1 > 5 || false);
        System.out.println("----------------------");
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(6 != 6);


    }
}
