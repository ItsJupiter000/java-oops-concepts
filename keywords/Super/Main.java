package keywords.Super;
// super:

// Refers to the immediate parent class object.
// Used to access parent class members and to call the parent class constructor.
// Example usage: in subclass methods to access parent class variables and methods, and to call the parent class constructor.



class Parent {
    int var = 100;

    void display() {
        System.out.println("Parent class method.");
    }
}

class Child extends Parent {
    int var = 200;

    void show() {
        // Using 'super' to access parent class variable
        System.out.println("Parent class variable: " + super.var);
        
        // Using 'super' to call parent class method
        super.display();
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
    }
}
