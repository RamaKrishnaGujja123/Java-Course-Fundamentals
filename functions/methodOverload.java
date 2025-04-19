package functions;

public class methodOverload {
    public int multiply(int a, int b){ 
        return a * b;
    }

    public double multiply(double a, double b){
        return a * b ;
    }

    public static void main (String[] args){
        //both methods are not static so we created an object
        methodOverload obj = new methodOverload();

        // now need to call both the int multipy and double multiply methods here using object
         int  intResult = obj.multiply(9, 6);
         System.out.println("The result from int multiply is - " + intResult);

         //now need to call the double multiply as same as above and we can also write the code as follows
         double doubleResult = obj.multiply(10.0,10.0);
         System.out.println("The result from the double multiply is - " + doubleResult);
    }
}
