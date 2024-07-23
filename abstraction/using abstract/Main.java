// Abstraction: is a process of hiding the implementation details and showing only functionality to the user.
// Data hiding for reduce complexity of code

abstract class Calculator {
    // Abstract methods for basic arithmetic operations - User Dashboard
    abstract int add(int a, int b);
    abstract int subtract(int a, int b);
    abstract int multiply(int a, int b);
    abstract double divide(int a, int b);
    // Concrete function (Body allowed)
    int sqare(int a){ 
        return a*a;
    }
}

class BasicCalculator extends Calculator {
    // Implementing the abstract methods
    @Override
    int add(int a, int b) {
        return a + b;
    }

    @Override
    int subtract(int a, int b) {
        return a - b;
    }

    @Override
    int multiply(int a, int b) {
        return a * b;
    }

    @Override
    double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of BasicCalculator
        Calculator calculator = new BasicCalculator();

        // Perform arithmetic operations
        System.out.println("Addition: " + calculator.add(10, 5));
        System.out.println("Subtraction: " + calculator.subtract(10, 5));
        System.out.println("Multiplication: " + calculator.multiply(10, 5));
        System.out.println("Division: " + calculator.divide(10, 5));
        System.out.println("Square: " + calculator.sqare(5));
    }
}
