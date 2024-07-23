interface Animal {
    void eat();
}

interface Pet {
    void play();
}

class Mammal {
    void breathe() {
        System.out.println("Mammal breathes");
    }
}

class Dog extends Mammal implements Animal, Pet {
    public void eat() {
        System.out.println("Dog eats");
    }

    public void play() {
        System.out.println("Dog plays");
    }
}

public class Hybrid {          //Using interface
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.breathe(); // From Mammal class
        dog.eat(); // From Animal interface
        dog.play(); // From Pet interface
    }
}
