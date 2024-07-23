// Run time polymorphism: Method Overriding
// Same method name, return type, and parameters
class Person {
    // Method to be overridden
    void walk() {
        System.out.println("Person is walking");
    }
    int isAlive(int age){
        System.out.println("The person is alive for " + age + " years");
        return 0;
    }
}

class Developer extends Person {
    // Overriding the makeSound method
    @Override
    void walk() {
        System.out.println("Developer is walking");
    }
    int isAlive(int age){
        System.out.println("The dog is alive for " + age + " years");
        return 0;
    }
}
class Tester extends Person {
    // Overriding the makeSound method
    @Override
    void walk() {
        System.out.println("Tester is walking");
    }
    int isAlive(int age){
        System.out.println("The cat is alive for " + age + " years");
        return 0;
    }
//     int isAlive(int age, String name){         // This will give an error as the method signature is different
//         System.out.println("The cat is alive for " + age + " years");
//         return 0;
//     }
// }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Developer();
        p1.walk();
        p1.isAlive(12);

        Person p2 = new Tester();
        p2.walk();
        p2.isAlive(10);
    }
}


