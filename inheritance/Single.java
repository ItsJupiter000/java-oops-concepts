package inheritance;

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Single {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // From Animal class
        dog.bark(); // From Dog class
    }
}
