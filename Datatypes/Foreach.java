public class Foreach{
    public static void main(String[] args){
//         //used to iterate over the arrays and collections 
//         //dont use if you want to get the index of the element 
//         //always looped from left to right

//         int [] Numbers = {1,2,3,4,5,6,7,8,9,0};
//         //Array called Numbers is there now we want too loop it
//         // SYNTAX for ( datatype variable given to array ; from collection or array)

//         for(int num:Numbers){
//             System.out.println(num);
//         }
//THIS IS AN ANOTHER EXAMPLE OF FOR EACH LOOP 
        String [] Bookstore = {"java", "React","Angular","java OOP"};
        System.out.println("The books in the bookstore are ");
        for (String book:Bookstore){
            System.out.println("- " + book);
            
        }

    }
}

