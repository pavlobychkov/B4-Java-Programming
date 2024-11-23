package day12_switch_statesments;

import java.util.Scanner;

public class Browser {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a browser type: ");
        String browser = key.nextLine();

        System.out.print("What is the web page you want to navigate to: ");
        String webPage = key.next();

        switch (browser) {
            case "Chrome":
                System.out.println("Opening " + webPage + " in Chrome browser");
                break;
            case "Safari":
            case "safari":
            case "SAFARI":
                System.out.println("Opening " + webPage + " in Safari browser");
                break;
            case "Firefox":
                System.out.println("Opening " + webPage + " in Firefox browser");
                break;
            case "Opera":
                System.out.println("Opening " + webPage + " in Opera browser");
                break;
            default:
                System.out.println("We do not have " + browser + " installed in our computer.");

        }
    }
}
