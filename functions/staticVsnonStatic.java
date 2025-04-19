package functions;

public class staticVsnonStatic {
    // Creating a static function with the no return type
    //static will create the object it self no need to create ourselt one
    public static void sayHi(){
        System.out.println("Static Hi");
    }
    // Create a non static function with  no return type
    // we need to create an object and call the function for this non static method or function
    public void sayBye(){
        System.out.println("Instance Bye");
    }

    //Time to create an object now for the sayBye() method
    public static void main(String[] args){
        sayHi();
        staticVsnonStatic obj = new staticVsnonStatic();
        //since the sayBye() is of no return type void we can call it directly
        obj.sayBye();
    }

}
