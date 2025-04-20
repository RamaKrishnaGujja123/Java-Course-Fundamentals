package Lambdas;

@FunctionalInterface
interface Calculator {
    int operation(int a, int b);
}

public class lambdaex {
    public static void main(String[] args) {

        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;

        System.out.println("Addition: " + add.operation(5, 6));
        System.out.println("Multiplication: " + multiply.operation(10, 15));
    }
}
