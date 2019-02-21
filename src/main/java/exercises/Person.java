package exercises;

public class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name) {
        this(name, 0);
    }

    boolean equals(Person other) {
        return other.name.equals(name) && other.age == age;
    }

    public String toString() {
        return name;
    }
}
