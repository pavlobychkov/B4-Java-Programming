package day18_loops;

public class Palindrome {
    public static void main(String[] args) {
        String word = "ANNA";
        String reversed = "";
        for (int i = word.length()-1; i >= 0; i--) {
            //System.out.println(word.charAt(i));
            reversed += word.charAt(i);
        }
     if (word.equalsIgnoreCase(reversed)) {
         System.out.println("It is PALINDROME");
     } else {
         System.out.println("It is not PALINDROME");
     }

    }
}
