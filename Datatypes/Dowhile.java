public class Dowhile{
    public static void main (String[] args){
        //do while loop can execute the condition even if the condition is false and also it will execute first and then check the condition
        // this will make sure that at least ONE EXECUTION IS POSSIBLE
        int i = 1;
        do { 
            System.out.println("int i =" + i);
            i++;
        } while (i<=1000);
    }
}