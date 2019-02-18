package exercises;

import test.Cow;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sleep();


        Animal a;
        
        System.out.println("Use variable 'a' with a cow:");
        a = new Cow();
        a.makeSound();

        System.out.println("Use variable 'a' with a cat:");
        a = new Cat();
        a.sleep();
    }
}