package day19_nested_loops;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "apple";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char outLetter = str.charAt(i);

            if (unique.contains( "" + outLetter )) {
                continue;
            }

            for (int j = 0; j < str.length(); j++) {
                char innerLetter = str.charAt(j);

                if (outLetter == innerLetter) {
                    count++;
                }
            }
            System.out.println(outLetter + " - " + count);
            unique += outLetter;
        }
    }
}
