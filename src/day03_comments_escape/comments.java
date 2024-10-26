package day03_comments_escape;

public class comments {

    public static void main (String [] args){

        // 1 - SINGLE LINE COMMENT
        // The line below prints a words "loopcamp" and goes to the next line

        System.out.println("Loopcamp");

        /*

        2 - MULTILINE COMMENT

            The following code is a PRINTLN statement
            It prints out "Java"
            Then goes to the next line
         */

        System.out.println("Java");

        System.out.println("Comment out");
        System.out.println("test");
        System.out.println("Check");
        System.out.println("Code");

        System.out.println("valid code");

        /**
         3 - JAVA DOC COMMENT
         The following is Println statement
         It prints out "1st week ofJava";
         This is written by QA team member: Pavlo
         */
        System.out.println("1st week of Java");

        //TODO: I need to find out how much i spent for the computer
        System.out.println("I recently bought a computer for $....");

        /*
        TODO: Check how much you need to deposit
         */
        System.out.println("Deposit $... to my account");
        // todo: this is just to remind that the syntax is not case sensitive

        /**
         * todo: can be used with Java DOC comment as well
         */

    }
}
