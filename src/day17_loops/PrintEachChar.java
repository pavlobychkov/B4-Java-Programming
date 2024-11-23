package day17_loops;

public class PrintEachChar {
    public static void main(String[] args) {
        String word = "loopcamp";

        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(4));
        System.out.println(word.charAt(5));
        System.out.println(word.charAt(6));
        System.out.println(word.charAt(7));

        System.out.println("-------------------");
        for (int i = 0; i < 8; i++) {
            System.out.println(word.charAt(i));
        }

        System.out.println("-----------------");

        for (int i = word.length()-1; i >= 0 ; i--) {
            System.out.println(word.charAt(i));
        }
        String reversed = "";
        for (int i = word.length()-1; i >= 0 ; i--) {
            reversed += word.charAt( i ); // reversed = "" + p; | reversed = "p" + m |  reversed = "pm" + a
        }
        System.out.println("Original: " + word);
        System.out.println("Reversed: " + reversed);
    }
}
