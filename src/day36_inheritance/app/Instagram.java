package day36_inheritance.app;

public class Instagram extends App{
    public Instagram(String name, double version){
       super("Instagram", version);
    }

    public void  postPicture() {
        System.out.println("Posting picture to " + name);
    }

}
