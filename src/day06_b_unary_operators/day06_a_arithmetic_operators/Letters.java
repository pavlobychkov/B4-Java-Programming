package day06_b_unary_operators.day06_a_arithmetic_operators;

public class Letters {

    public static void main (String [] args){

        char letter = 'G';
        System.out.println(letter++); // use and then update
        System.out.println(letter); // print (next letter)
        System.out.println(++letter); // pre, update then use

        int t =100;
        int p = - ++t * -t-- / t++ + --t;

        System.out.println(p);
        //int A = 50;

        //int a = 1;
        //int b = -a-- + a++ / -a-- * --a;
       // System.out.println(b);


        int X = 4;
        int Y = X * 4 - X++;

        System.out.println(Y);

        int A = 50;
        int B = --A + A++ + A-- + A++;

        System.out.println(B);

        int a = 1;
        int b = -a-- + a++ / -a-- * --a;
        System.out.println(b);


        int R = 20;
        int W = -R-- + -R++ + --R * R-- % 2;
        System.out.println(W);


        int M = 300;
        int N = 400;
        int U = ++M + N++ - M-- % 2 + --N % 2;
        System.out.println(U);
    }
}
