package Oopjava;

abstract class Abstract {
    @SuppressWarnings("unused")
    abstract void start(); // abstract method

    void fuel() { // concrete method
        System.out.println("Petrol or Diesel");
    }
}

class Bike extends Abstract {  // Fixed class name and spelling
    @Override
    void start() {
        System.out.println("Bike is started with a kick");
    }
}

public class Main {  // Better to have a separate main class
    public static void main(String[] args) {
        // Correct: Create instance of concrete subclass
        Bike obj = new Bike();
        obj.fuel();
        obj.start();
    }
}