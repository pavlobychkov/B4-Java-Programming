package day30_b_custom_classes;

public class UsingItem {
    public static void main(String[] args) {

       Item item1 = new Item();

       item1.name = "orange";
       item1.price = 2.99;

        System.out.println(item1);
        System.out.println(new Item());

        System.out.println();
        Item item2 = new Item();
        System.out.println(item2);

        System.out.println();
        System.out.println(item2.toString());


    }
}
