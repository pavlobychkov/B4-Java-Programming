package day03_tasks.day_04_variables;

public class Fruits {

    public static void main (String [] args){

    int apples = 60;
    int grapes = 80;
              int bananas = 100;

        System.out.println("This is how many apples I have: " + 60);
        System.out.println("This is how many apples I have: " + apples);
        System.out.println(grapes);
        System.out.println("bananas = " + bananas); // bananas.soutv

        // REASSIGNMENT
        // I sold 30 apples
        System.out.println("I sold 30 apples");
        apples = 40;
        System.out.println("This is how many apples I have: " + apples);
        System.out.println("---------");
        double price = 15.99;
        System.out.println("The discounted price for all the left over apples is $" +"15.99"); // HARCODED
        System.out.println("The discounted price for all the left over apples is $" + price); // DYNAMIC

        System.out.println("----------");
        // CONCATENATION vs plus (math)
        System.out.println(50+50);




    }
}
