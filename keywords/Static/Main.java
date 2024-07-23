package keywords.Static;
// static:

// Belongs to the class rather than any instance.
// Can be accessed without creating an object.
// Example usage: static variables and methods.

class Person {

    String name;
    int age;

    static int count = 100;  //static menas its now a class property, not just object's property

    // Static method
    static void walk() {
        System.out.println("Person is walking");
    }
}

public class Main {
    public static void main(String[] args) {
        // Accessing static variable
        System.out.println("Static variable: " + Person.count);

        // Accessing static method
        // We dont have to create an object of person to access static method
        Person.walk();
    }
}
// output: Static variable: 100