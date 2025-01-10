package day38_a_abstraction_interface.animal;

import day37_a_abstraction.language.Language;

public class Parrot extends Bird implements Flyable, Language {

    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }



    @Override
    public void useWings() {
        System.out.println("Parrot has wings");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, Parrot !");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Goodbye, Parrot !");
    }
}
