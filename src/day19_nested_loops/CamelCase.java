package day19_nested_loops;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter multi words sentence: ");
        String str = key.nextLine().trim().toLowerCase();
        String camelCase = "" + str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
           if (str.charAt(i - 1) == ' ') {
                camelCase += ( "" + str.charAt(i) ).toUpperCase();
              } else {
               camelCase += str.charAt(i);
            }
        }
        System.out.println(camelCase.replace(" ", ""));
    }
}
