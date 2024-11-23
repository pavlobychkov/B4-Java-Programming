package day14_string;

public class StartAndEnd {
    public static void main(String[] args) {
        String str = "Loopcamp";

        System.out.println(str.startsWith("Loop"));
        System.out.println(str.startsWith("loop"));
        System.out.println();
        System.out.println(str.startsWith("Loopcamp"));
        System.out.println(str.startsWith("Loopcamp@"));

        String str3 = "Loop";
        System.out.println(str.startsWith(str3));
        System.out.println(str.startsWith(str3));
        System.out.println(str.startsWith("Loop"));

        System.out.println();

        String sentence = "Thursday is a java class day.";
        System.out.println(sentence.startsWith("Thu"));

        boolean hasStart = str.startsWith("Loop");
        boolean hasSameEnd = str.endsWith("camp");
        System.out.println(hasStart);
        System.out.println(hasSameEnd);




    }
}
