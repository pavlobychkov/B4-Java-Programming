package day14_string;

import java.util.Locale;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String expectedUserName = "java@gmail.com";
        String expectedPassword = "loopcamp";

        Scanner key = new Scanner(System.in);
        System.out.print("Please enter your username: ");
        String inputUserName = key.next().toLowerCase(Locale.ROOT);

        System.out.print("Please enter your password: ");
        String inputUserPassword = key.next();

        boolean isValid = inputUserName.equalsIgnoreCase((expectedUserName)) && inputUserPassword.length() == 8 && inputUserPassword.equals(expectedPassword);
        if (isValid) {
            System.out.println("LOGGED IN");
        } else {
            System.out.println("You have entered invalid username or password");
        }
    }
}
