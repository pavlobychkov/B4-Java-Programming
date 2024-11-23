package day16_loops;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter a URL: ");
        String url = scan.next();

        url = url.substring(url.indexOf(".") +1, url.lastIndexOf(".")  );

        System.out.println(url);
    }
}
