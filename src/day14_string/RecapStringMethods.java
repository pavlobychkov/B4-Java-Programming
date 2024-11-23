package day14_string;

public class RecapStringMethods {
    public static void main(String[] args) {
        String str1 = "loop";
        String str2 = new String("loop");

        System.out.println(str1 == str2); // compare memory location
        System.out.println(str1.equals(str2)); //comparing VALUES


    }
}
