package functions;

public class noReturnnoParam{
    public void Greet(){
        System.out.println("Hello from JAVA");
    }

 // Every Java program should have a main method, which acts as the entry point for execution.
// In the main method, we created an object of the class "noReturnnoParam" called "obj".
// Using the object "obj", we called the "Greet" method by writing obj.Greet().
    public static void main(String[] args){
        noReturnnoParam obj = new noReturnnoParam();
        obj.Greet();
    }
}
