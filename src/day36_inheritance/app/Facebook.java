package day36_inheritance.app;

public class Facebook extends App {
    public Facebook(String name, double version) {
   super("Facebook", version);
    }
    public void watchVideo() {
        System.out.println("Watching video on " + name);
    }
}

