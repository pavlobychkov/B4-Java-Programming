package day06_b_unary_operators.day06_a_arithmetic_operators;

public class BasicCalculator {

    public static void main (String [] args){

        double num1 =13;
        double num2 = 5;

        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double remainder = num1 % num2;

        System.out.println(num1 + " + " + num2 + " = " + addition);
        System.out.println(num1 + " - " + num2 + " = " + subtraction);
        System.out.println(num1 + " * " + num2 + " = " + multiplication);
        System.out.println(num1 + " / "+ num2 + " = " + division);
        System.out.println(num1 + " % "+ num2 + " = " + remainder);

        System.out.println();
        int i1 = 13;
        int i2 = 5;
        int div = i1 / i2;
        double div2 = i1 / i2;
        System.out.println(div);
        System.out.println(div2);

        int rem = i1 % i2;
        double rem2 = i1 % i2;
        System.out.println(rem);
        System.out.println(rem2);

        System.out.println();
        System.out.println("-------------------------");
        int a = 5;
        double d = 4;
        System.out.println(a + d);

        byte b = 3;
        short s = 2;
        System.out.println(b * s);

        byte b1 = 4;
        short s2 = 5;
        short result = (short)(b1 * s2);
        System.out.println(result);
        System.out.println();
        System.out.println("--------------");

        double result2 = b1 + s2;




    }
}
