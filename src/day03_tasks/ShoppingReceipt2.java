package day03_tasks;

import java.sql.SQLOutput;

public class ShoppingReceipt2 {

    public static void main(String [] args){

        int cake = 24;
             double Water = 3.99;
             double Apple_Juice = 7.50;
             double Bread = 4.25;
             double Tax = 3.90;
             double Total;
             double Grand_Total;
             Total = Water + Apple_Juice + Bread;
             Grand_Total = Total + Tax;
             String strs = "****************************";
             char crnc = '$';
             String dash = "-------------------------";
             String thanks = "********THANK YOU*********";
             String  CAKE = "Cake";
        String water = "Water";
        String apple_juice = "Apple Juice";
        String bread = "Bread";
        String tax = "Tax";
        String total_amount = "TOTAL AMOUNT";
        String grand_total = "GRAND TOTAL";
        String wlcm = "WELCOME TO THE STORE";
        System.out.println(strs+"\n" +"\t" +  wlcm + "\n" + strs + "\n\n"+ dash + "\n");
        System.out.println(CAKE+ "\t" + "\t" +"\t" + cake + crnc);
        System.out.println(water + "\t" + "\t" + "\t" + Water + crnc);
        System.out.println(apple_juice + "\t" + "\t" + Apple_Juice + crnc);
        System.out.println(bread + "\t" + "\t" + "\t" + Bread + crnc);
        System.out.println("\n" + dash);
        System.out.println(total_amount +":" + "\t" + crnc + Total);
        System.out.println(tax + ":" + "\t" + "\t" + "\t" + crnc + Tax);
        System.out.println();
        System.out.println(grand_total + ":" + "\t" + crnc + Grand_Total);
        System.out.println(dash + "\n" + thanks);














    }
}
