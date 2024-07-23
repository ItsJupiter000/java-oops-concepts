package keywords.This;
// This keyword in Java

// Refers to the current instance of the class.
// Used to avoid naming conflicts and to refer to instance variables and methods.
// Example usage: in constructors and instance methods to access instance variables.

class Person{
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + this.name + " Age: " + this.age);
    }

}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(35, "Arjun");
        p1.display();
    }
}

