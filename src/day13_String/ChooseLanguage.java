package day13_String;

import java.util.Scanner;

public class ChooseLanguage {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Please, choose one of the options below: ");
        System.out.print("\t1 - English\n\t2 - Spanish\n\t3 -Turkish\n\t4 - Russian\n\t5 - French\n\t6 - Azerbaijan\n\n\tYour Option: ");
        int userOption = key.nextInt();

        if (userOption == 1) {
            System.out.println("\t\tHello, thanks for your call");
        } else if (userOption == 2) {
            System.out.println("\t\tGrasias, parallamar");
        } else if (userOption == 3) {
            System.out.println("\t\t Marhaba");
        } else if (userOption == 4) {
            System.out.println("\t\tSpasibo za vash vybor");
        } else if (userOption == 5) {
            System.out.println("\t\tMerci");
        } else if (userOption == 6) {
            System.out.println("\t\tWe will use English by default");
        }
        System.out.println("-----------------------------------------");

        String message;
        switch (userOption) {
            case 1:
            message = "\t\tHello, thanks for your call";
            break;
            case 2:
                message = "\t\tGrasias, parallamar";
                break;
            case 3:
                message = "\t\tGrasias, parallamar";
                break;
            case 4:
                message = "\t\tSpasibo za vash vybor";
                break;
            case 5:
                message = "\t\tMerci";
                break;
            case 6:
                message = "\t\tMarhaba";
            default:
                message = "\t\tWe will use English by default";
        }
        System.out.println(message);
    }
}
