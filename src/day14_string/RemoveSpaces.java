package day14_string;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "             loopcamp          ";
        System.out.println(str);

        str = str.trim();
        System.out.println(str);

        String str2 = "       java is fun       ";
        System.out.println(str2.length());
        System.out.println(str2.trim());
        System.out.println(str2.trim().length());

        System.out.println();
        String str3 = "\tThursday";
        System.out.println(str3);
        System.out.println(str3.length());
        System.out.println(str3.trim().length());


    }
}
