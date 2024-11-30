package day20_nested_loops;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "AbbCD$CSTGF(";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char eachLetter1stLoop = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                char eachLetter2ndLoop = str. charAt(j);

                if (eachLetter1stLoop == eachLetter2ndLoop) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(eachLetter1stLoop);
            }
        }
    }
}
