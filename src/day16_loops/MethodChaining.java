package day16_loops;

public class MethodChaining {
    public static void main(String[] args) {
        String sentence = "Wednesday is a good day. We have java class    234     ";
        System.out.println(sentence);

        sentence = sentence.replace("234", "").trim();
        System.out.println(sentence);


    }
}
