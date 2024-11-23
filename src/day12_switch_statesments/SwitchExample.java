package day12_switch_statesments;

public class SwitchExample {
    public static void main(String[] args) {

        int num = 5;
        switch (num) {
            case 1:
                System.out.println("Before arithmetic operators applied: " + num);
                num *= num;
                System.out.println("After arithmetic operators applied: " + num);
                break;
            case 5:
                System.out.println("Befpore module applied: " + num);
                if (num % 2 == 0) {
                    System.out.println("Even num");
                } else {
                    System.out.println("Odd num");
                }
        }

    }
}
