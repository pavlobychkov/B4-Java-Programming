package day10_if_statements;

public class CheckCharacter {

    public static void main(String[] args) {

        char letter = 'J';

        if ('a' <= letter && letter <= 'z'){
            System.out.println("lower case letter");
        }

        if ('A' <= letter && letter <= 'Z'){
            System.out.println("UPPER CASE LETTER");
        }
    }
}
