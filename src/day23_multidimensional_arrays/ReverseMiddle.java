package day23_multidimensional_arrays;

public class ReverseMiddle {
    public static void main(String[] args) {


        String sentence = "java always fun";
        String [] arr = sentence.split(" ");
        String middle = arr[1];
        String midReverse = "";

        char [] letters = middle.toCharArray();

        for (int i = letters.length-1; i >= 0; i--) {
            midReverse += letters[i];
        }
        System.out.println(midReverse);
        System.out.println(arr[0] + " " + midReverse + " " + arr[2]);
    }
}
