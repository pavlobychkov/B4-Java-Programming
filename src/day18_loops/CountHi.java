package day18_loops;

public class CountHi {
    public static void main(String[] args) {

        String word = "aahiaahisvhisvhishfehihigkhieog";
        int count = 0;
        for (int i = 0; i < word.length()-1; i++) {
            if (word.charAt(i) == 'h' && word.charAt(i+1) == 'i') {
                count++;
            }
        }

        System.out.println("You got " + count + " time \"hi\" in \"" + word + "\"");
    }
}
