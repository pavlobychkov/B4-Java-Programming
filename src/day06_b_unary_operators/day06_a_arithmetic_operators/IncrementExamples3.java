package day06_b_unary_operators.day06_a_arithmetic_operators;

import java.sql.SQLOutput;

public class IncrementExamples3 {

    public static void main (String [] args){

        int i =5;
        int z = i++;
        System.out.println(i);
        System.out.println(z);

        int a = 10;
        int b = a + 1;

        System.out.println(a);
        System.out.println(b);

        int c = ++a;
        System.out.println(a);
        System.out.println(c);
    }
}
