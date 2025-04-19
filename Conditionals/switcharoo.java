package Conditionals;

public class switcharoo {
    public static void main(String[] args) {
        String role = "admin";
        switch (role){
            case "admin" -> System.out.println("Access Granted");
            case "user" -> System.out.println("Limited Access");
            //It's better to always use default case to get atleast one output
            case "defualt" -> System.out.println("No Access");
        }
    }
}
