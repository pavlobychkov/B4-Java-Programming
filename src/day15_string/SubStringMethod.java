package day15_string;

public class SubStringMethod {
    public static void main(String[] args) {
        String word = "Saturday";
        //             01234567

        System.out.println(word.substring(0));
        System.out.println(word.substring(1));
        System.out.println(word.substring(2));
        System.out.println(word.substring(3));
        System.out.println();

        System.out.println( word.substring( 1,2));
        System.out.println( word.substring( 0,3));

        System.out.println( word.substring(5,8)); // 8 - is not inclusive, stops before 8


    }
}
