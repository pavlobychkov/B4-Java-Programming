package day13_String;

public class StringImmutable {
    public static void main(String[] args) {
        String str1 = "loop";
        str1 = str1.toUpperCase();
        str1 = str1 + "camp";
        System.out.println(str1);

        String str2 = new String("Loop");
        str2 = str2 + "camp";
    }
}
