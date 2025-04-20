package ExceptionHandling;

// Main class for try-catch-finally example
public class TCFBlock {
    public static void main(String[] args) {
        int result = 0;
        try {
            result = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Integer cannot be divided by zero");
        } finally {
            System.out.println("Always executed - " + result);
        }
    }
}

// Custom exception class
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

// Separate class with main method to test the custom exception
@SuppressWarnings("unused")
class CustomException {
    public static void main(String[] args) {
        int age = 19;

        try {
            if (age < 18) {
                throw new AgeException("Minors are not allowed");
            } else {
                System.out.println("Access granted!");
            }
        } catch (AgeException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}
