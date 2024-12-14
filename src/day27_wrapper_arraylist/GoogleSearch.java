package day27_wrapper_arraylist;

public class GoogleSearch {
    public static void main(String[] args) {
        String searchResultInfo = "About 558,000,000 results (0.29 seconds)";

        searchResultInfo = searchResultInfo.replace("(", "").replace(")", "");
        String[] resultInArr = searchResultInfo.split(" ");
        String time = resultInArr[resultInArr.length - 2];
        System.out.println(time);

        double time1 = Double.parseDouble(time);

        if (time1 < 0.5){
            System.out.println("Pass");
        }

    }
}
