package inheritance;

interface Animal {
    void eat();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {
    public void eat() {
        System.out.println("Dog eats");
    }

    public void play() {
        System.out.println("Dog plays");
    }
}

public class Multiple {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // From Animal interface
        dog.play(); // From Pet interface
    }
}

