package functions;

public class returnParam{
//we are creating a function with return type and take parameters
public static int add(int a, int b){
    return a + b;
}

// the below 3 line code only work if the add() function is not static so remove static to run below code in add()

public static void main(String[] args) {
//     returnParam obj = new returnParam();
//    System.out.println(obj.add(8798798,858756675));

   //we can also call the add() method from above to here
   int result = add(5,9); //method is called from above 
   System.out.println(result);
}
} // no need to create an object if the static is present in the method
