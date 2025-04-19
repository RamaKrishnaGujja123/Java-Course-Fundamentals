package Oopjava.java;

public class polymorphism {
    //method overloading and overriding are called the part of polymorphism
    //method overloading meaning using the same method with different parameters or different datatypes
    //OVERLOADING is compile time

    int add(int a, int b){
        return a + b;
    }
    
    double add(double a, double b){
        return a + b ;
    }
    // add a main class to call these functions and create an access these values
    public static void main(String[] args) {
        
        // creating an object for not static methods double add and int add
        polymorphism obj = new polymorphism();
        int intRes = obj.add(5,7);
        System.out.println("The int add result is - " + intRes);
        double doubleRes = obj.add(10.0, 11.0);
        System.out.println("the double add result is - " + doubleRes);
    }
}
