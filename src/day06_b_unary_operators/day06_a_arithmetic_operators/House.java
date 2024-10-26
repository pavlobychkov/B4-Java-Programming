package day06_b_unary_operators.day06_a_arithmetic_operators;

public class House {

    public static void main (String [] args){

  //      houseType = "Single House";
   //     address = "123 Test Dr. Fairfax, VA 22031";

   String houseType = "Single House";
   String address = "123 Test Dr. Fairfax, VA 22031";

   int numOfBedrooms = 5;
   int numOfKitchens = 2;
   int zipCode = 12345;

   boolean isThereBasement = true;
   boolean IsThereSnow = false;
   boolean isPool = true;
   boolean isForSale = true;
   boolean isNearByPark = false;

   double numOfBathrooms = 2.5;
   double costOfHouse = 999_999.99;
   double schoolRatings = 4.75;

   // I am looking for $houseType which is located in $address ND $zipCode.
        // It has numOfBedrooms and numOfKitchens as well as numOfBathrooms.
        // The cost of the house is $$costOfHouse.
        //The house has the following additional info:
        //School ratings: $schoolRatings
        // Has pool:        $hasPool
        //Has attic:        $hasAttic
        //Is For Sale:      $isForSale

  String result = " I am looking for " +  houseType + " which is located in " + address + zipCode + ".\n" +
          " It has " + numOfBedrooms + " bedrooms and " + numOfKitchens +  " kitchens as well as "  + numOfBathrooms + " bathrooms.\n" +
          " The cost of the house is " + costOfHouse + ".\n" +
          " The house has the following additional info:\n" +
          "\tSchool ratings:"  + schoolRatings + "\n" +
          "\tHas pool: " + isPool + "\n" +
          "\tHas attic: "  + "\n" +
          "\tIs For Sale: " + isForSale;

        System.out.println(result);


    }
}
