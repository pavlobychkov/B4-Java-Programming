package day20_nested_loops;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
        } else {

            for (int i = 0; i < str1.length(); i++) {
                char eachChar = str1.charAt(i);
                str2 = str2.replaceFirst(eachChar+"","");

            }
            if (str2.isEmpty()) {
                System.out.println("It is Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        }
    }
}
