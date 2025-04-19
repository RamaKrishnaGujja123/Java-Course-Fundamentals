
public class BreaknContinue{
    public static void main (String [] args){
        //breaks or stop if certain condition is met 
        //continues if the certain condition met till nothing left the array or collections
        //used within FOR, WHILE ,DO WHILE and SWITCH loops
        
        for (int i =1; i <=1000; i++){
            if (i == 999) break; //breaks if true once break then cont continue
            if (i % 2 == 0) continue; // continues if true till the end of the last int
            System.out.println(i);
        }
        //another example using String arrays we can also use the collections
        String [] Names = {"Ram", "Bittu","Rk","",null,"abc"};
       // now we have the array named Names now we need to access the each of the elements in tharray using for-each loop and also break and continue to check whether each element is a name or not we have to filter out
       for(String name : Names){
        if (name == null || name.isEmpty()) continue;
        System.out.println("The names are ");
        System.out.println("-" + name);
       }
    }
}