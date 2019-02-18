package exercises;

public abstract class Animal {
    // Example for a design pattern called "Template Method"
    public void sleep() {
        System.out.println("Sleeping...");
        System.out.println("Now, I'm waking up and making a sound:");
        makeSound();
    }

    // what should we do here?
    // --> we cannot implement this method!
    public abstract void makeSound();

    protected void doSomething() {
        System.out.println();
    }
}

class Cat extends Animal {
    public void makeSound() {
        meow();
    }
    void meow() {
        System.out.println("meow!");
    }
}