package day36_inheritance.app;

public class AppStore {
    public static void main(String[] args) {

        Instagram instagram = new Instagram("Instagram", 23.5);
        System.out.println(instagram.version);
        System.out.println(instagram.name);
        instagram.postPicture();
        instagram.download();

        System.out.println("-----------");

        Facebook facebook = new Facebook("Facebook", 27.5);
        System.out.println(facebook.version);
        System.out.println(facebook.name);
        facebook.watchVideo();
        facebook.download();
    }
}
