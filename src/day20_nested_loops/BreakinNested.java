package day20_nested_loops;

public class BreakinNested {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);

            if ( i == 3) {
                break;
            }

            for (int j = 0; j < 3; j++) {
                System.out.println("j: " + j);
                break;
            }
        }

    }
}
