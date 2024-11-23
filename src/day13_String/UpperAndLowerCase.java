package day13_String;

public class UpperAndLowerCase {
    public static void main(String[] args) {
        String str = "Wednesday";
        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str);
        str = str.toUpperCase();
        System.out.println(str);

        System.out.println("---------------------------");
        System.out.println(str.toLowerCase());
        System.out.println(str);

    }
}
