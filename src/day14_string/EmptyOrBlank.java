package day14_string;

public class EmptyOrBlank {
    public static void main(String[] args) {
        String str = "new word";
        System.out.println(str.isEmpty());

        str = " "; // reassigned
        System.out.println(str.isEmpty()); // it still has a character in it "_"

        str = "";
        System.out.println(str.isEmpty()); // this time its completely empty, not a single character in it

        System.out.println(str.length());

        System.out.println(str.length() == 0 ? "There is no character" : "There are some characters");
        System.out.println("---------------");

        System.out.println("Is Empty: " + str.isEmpty());
        System.out.println("Is Blank: " + str.isBlank());

        str = "Java is fun";

        System.out.println("Is Empty: " + str.isEmpty());
        System.out.println("Is Blank: " + str.isBlank());

        System.out.println("--------------------");

        str = " ";
        System.out.println("Is Empty" + str.isEmpty());
        System.out.println("Is Blank" + str.isBlank());

    }
}
