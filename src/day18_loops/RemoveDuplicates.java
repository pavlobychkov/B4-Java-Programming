package day18_loops;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "adesdeewrwpawiowddadojfeofgjrooifbj";
        String unique = "";

        for (int i = 0; i < str.length() ; i++) {

            char eachChar = str.charAt(i);
            if (!unique.contains("" + eachChar)) {
                unique += eachChar;
            }
        }
        System.out.println("Original: " + str);
        System.out.println("Unique: " + unique);
    }
}
