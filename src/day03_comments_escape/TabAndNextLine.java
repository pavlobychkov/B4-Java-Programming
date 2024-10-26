package day03_comments_escape;

public class TabAndNextLine {

    public static void main (String [] args){

        System.out.println("A Sentence");     // has not space in the beginning
        System.out.println(" A Sentence");    // has 1 space in the beginning
        System.out.println("  A Sentence");   // has 2 space in the beginning
        System.out.println("   A Sentence");  // has 3 space in the beginning
        System.out.println("    A Sentence"); // has 4 space in the beginning

        // Now, I will use tab to do 4 spaces at one:   \t   --- >  4 spaces
        System.out.println("\tA Sentence");

    }
}
