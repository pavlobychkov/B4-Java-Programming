package day06_b_unary_operators.day06_a_arithmetic_operators;

public class Store {

    public static void main (String [] args){

        String store = "Costco";
        int numOfTv = 100;

        System.out.println("SOMEONE CAME INTO THE STORE AND THEY BOUGHT A TV");
        numOfTv = numOfTv - 1;
        System.out.println("Number of TV in stock: " + numOfTv);

        System.out.println("Another one bought the same TV");
        System.out.println("Number of TV in stock: " + --numOfTv);

        System.out.println("Someone else came into the store and out the into the shopping cart have not paid yet");
        System.out.println("Number of TVs in stock (in computer): " + numOfTv);
        System.out.println("Person actully now paid for it.");
        System.out.println("Number of TVs in stock (in computer): " + numOfTv--);
        System.out.println("Number of TVs in stock (in computer): " + numOfTv);


    }
}
