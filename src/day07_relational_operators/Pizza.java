package day07_relational_operators;

public class Pizza {

    public static void main (String [] args){

        String pizzaType = "Peperonni";
        int numOfSlices = 10;
        int numOfPeople = 3;
        int slicesPerPerson = numOfSlices / numOfPeople;
        int slicesLeftOver = numOfPeople / slicesPerPerson;

        String result = "We bought " + pizzaType + " pizza. It has " + numOfSlices +
                " slices. We are " + numOfPeople + " people and each of us will eat " +
                slicesPerPerson + " slices and there will " + slicesLeftOver + " slices left over.";

        System.out.println(result);


    }
}
