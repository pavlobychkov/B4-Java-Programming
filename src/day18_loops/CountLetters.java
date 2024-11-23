package day18_loops;

public class CountLetters {
    public static void main(String[] args) {
        String word = "aabbcaa";
        char letter = 'b';
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
            count++;
            }

        }
        System.out.println("In " + word + ", we have " + count + "\'"  + letter + "\' character" );
    }
}