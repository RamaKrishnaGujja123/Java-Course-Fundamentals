package functions;

// create a main function and class 
public class Lambdafun {
    public static void main(String[] args) {
// Here we are using Calculator interface to do some operations using variables a and b
        Calculator add = (a,b) -> a + b; //lambda expression
 //calling out the function operate with add function of calculator interface
        System.out.println(add.operate(10,8));
//similarly same with different operation
        Calculator multiply = (a,b) -> a * b; // lambda expression
        System.out.println(multiply.operate(10, 10));
    }
}
