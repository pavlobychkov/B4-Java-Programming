package day11_if_statements;

public class Ternary {

    public static void main(String[] args) {

        int a = 70;
        String result;

        if (a % 2 == 0) {
            result = "Even number";
        } else {
            result = "Odd number";
        }
        System.out.println(result);

        System.out.println("-----------------");

        result = a % 2 == 0 ? "Even number form ternary" : "Odd number from ternary";
        System.out.println(result);


    }
}
