// interface are true absraction
// interface means 

interface Calculator {
    // Methods for basic arithmetic operations

    // all above methods will be bydefault public and abstract
    // no body allowed in methods
    int add(int a, int b);
    int subtract(int a, int b);
    int multiply(int a, int b);
    double divide(int a, int b);

    // Default method (with body)
    default void poweroff() {
        System.out.println("Calculator is turning off");
    }
}

class BasicCalculator implements Calculator {
    // Implementing the methods from the Calculator interface
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public double divide(int a, int b) {
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
    }
}
