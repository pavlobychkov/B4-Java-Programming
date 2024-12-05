package day07_relational_operators;

public class RelationalOperators {

    public static void main (String [] args){

        int t = 100;
        int p = - ++t * t-- / t++ + --t;

        System.out.println(p);
    }
}
