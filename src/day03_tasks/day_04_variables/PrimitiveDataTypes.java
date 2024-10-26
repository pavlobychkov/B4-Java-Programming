package day03_tasks.day_04_variables;

public class PrimitiveDataTypes {

    /*
    data types:
    1) Primitive
       a)Integer Type
         -byte
         -short
         -int
         -long

       c) Single Characters
    2) Non-primitive
     */

    public static void main (String [] args){

        byte age = 34; // Declared a variable called age and datatype is byte and assigned a value 34;
        System.out.println("age"); // "age" is not variable name. It is value itself of string datatype
        System.out.println(age); // sgr id variable here. Database is -- > byte
        System.out.println(34); // 34 is value and BY DEFAULT it is an int datatype because it is a whole number

        // byte b2 = 200; // This will cause an error because byt can only hold from - 128 to 127. 200 is big for this container
        System.out.println("----------");

        short year;
        year = 2024;
        System.out.println(year);
        System.out.println(2024);
        System.out.println("----------");

        int ipNumber = 123456; // Declared a variable called ipNumber and datatype is int
        System.out.println(ipNumber);
        System.out.println(123456);
        long accNumber = 1234567889;
        System.out.println(accNumber);





    }
}
