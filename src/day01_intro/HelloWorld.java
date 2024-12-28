package day01_intro;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("HelloWorld");

  int check = 132;
  String str = "";

  if (check % 2 == 0) {
      str += check;
      if (check % 5 == 0) {
          str += "132";
      } else {
          str = "500";
      }
      } else {
          str += "123";
      }
      System.out.println(str);
  }
    }

