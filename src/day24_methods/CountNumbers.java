package day24_methods;

public class CountNumbers {
    public static void main(String[] args) {
        countUpNum(5);
        countUpNum(10);

        int a = 100;
        countUpNum(a);

        countUpNum(-10);
    }

    public static void countUpNum (int num){
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
