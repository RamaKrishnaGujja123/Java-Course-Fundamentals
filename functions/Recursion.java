package functions;

public class Recursion {
    public int factorial(int n) {
        if( n < 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
    // since it has no returntype or non static need an object with main()
    public static void main(String[] args) {
        Recursion obj = new Recursion();// new object is created 
        System.out.println(obj.factorial(5)); //factorial method is called using newly created object
    }
}
