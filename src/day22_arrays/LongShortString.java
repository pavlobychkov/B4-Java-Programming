package day22_arrays;

public class LongShortString {
    public static void main(String[] args) {

        String[] words = {"Java", "Selenium", "Softskills", "Mentors"};

        String longest = words[0];
        String shortest = words[0];

        for (String eachElem : words) {

            if (eachElem.length() >= longest.length()) {
                longest = eachElem;
            }
            if (eachElem.length() <= shortest.length()) {
                shortest = eachElem;
            }

        }
        System.out.println("LONGEST: " + longest);
        System.out.println("SHORTEST: " + shortest);
    }
}
