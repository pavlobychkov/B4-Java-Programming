package day18_loops;

public class CharactersInSpring {
    public static void main(String[] args) {
        String word = "pavlo";

        for (int i = 0; i < word.length(); i++) {
            int asciiNum = word.charAt(i);
            System.out.println(asciiNum);

        }
    }
}
