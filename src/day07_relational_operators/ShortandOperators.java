package day07_relational_operators;

public class ShortandOperators {

    public static void main (String [] args){

        int a = 10;      //declared and initialized
        a = 20;          // re-assigned a new value
        a++;             // re-assigned by POST INCREMENT
        ++a;             // re-assigned by PRE INCREMENT
        a = a + 1;       // re-assigned by adding 1
        a = a + 10;      // re-assigned by adding 10 in regular way
        a += 10;         // re-assigned by SHORTAND OPERATOR
        a =+ 10;         // This is not SHORTAND OPERATOR

        int b = 2;
        b *= 3; // b = 6

        int c = 10;
        c %= 3; // = 1

    }
}
