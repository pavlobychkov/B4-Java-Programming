package day11_if_statements;

public class AmazonPrime {

    public static void main(String[] args) {

        double price = 10.99;
        boolean hasPrime = true;

        if (hasPrime) {
            System.out.println("Eligible for 2 days shipping");
        } else {
            if (price >= 25) {
                System.out.println("Eligible ofr regular free shipping");
            } else {
                System.out.println("Not eligible for free shipping. Hipping fee: $3.99");
                price += 3.99;
                System.out.println("Price: " + price);
            }
        }
    }
}
