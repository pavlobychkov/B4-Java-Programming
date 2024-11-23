package day12_switch_statesments;

public class NumberInWords {
    public static void main(String[] args) {

        int num = 4;
        if (num >= 1 && num <= 5) {
            if (num == 1) {
                System.out.println("one");
            } else if (num == 2) {
                System.out.println("two");
            } else if (num == 3) {
                System.out.println("three");
            } else if (num == 4) {
                System.out.println("four");
            } else if (num == 5) {
                System.out.println("five");
            }
        }
        System.out.println("--------------------");

        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
            case 5:
                System.out.println("Five");
            default:
                System.out.println("Not in range 1-5");
        }
    }
}