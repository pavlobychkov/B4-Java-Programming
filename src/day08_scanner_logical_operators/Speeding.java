package day08_scanner_logical_operators;

public class Speeding {

    public static void main (String [] args){

                int currentSpeed = 26;
                int speedLimit = 25;

                boolean isSpeeding = currentSpeed > speedLimit + 5;

        System.out.println("You are speeding: " + isSpeeding);
        System.out.println("Speeding limit in law in this area is: " + speedLimit);
    }
}
