package day06_b_unary_operators.day06_a_arithmetic_operators;

public class ParkingLot {

    public static void main (String [] args){

        int carsInParkingLot = 10;
        System.out.println("2 cars drove into parking lot");
        carsInParkingLot = carsInParkingLot + 2;
        System.out.println("Cars in Parking Lot: " + carsInParkingLot);
        ++carsInParkingLot;
        ++carsInParkingLot;
        System.out.println("Cars in parking lot: " + carsInParkingLot);


    }
}
