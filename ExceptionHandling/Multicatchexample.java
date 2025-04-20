package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Multicatchexample {
    public static void main(String[] args) {
        try {
            // Uncomment ONE of these lines to test the exception

            // Test 1: NullPointerException
            // String text = null;
            // System.out.println(text.length());

            // Test 2: FileNotFoundException
            FileReader fr = new FileReader("nonexistant.txt");

        } catch (NullPointerException exception) {
            System.out.println("Caught a null pointer exception!");
        } catch (FileNotFoundException exception) {
            System.out.println("Caught a file not found exception");
        } catch (Exception e) {
            System.out.println("Caught some other error: " + e.getMessage());
        }
    }
}
