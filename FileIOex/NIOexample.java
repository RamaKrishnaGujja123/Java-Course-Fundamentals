package FileIOex;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NIOexample{
    public static void main(String[] args) throws Exception{
        Path path = Paths.get("data.txt");
        List<String> lines = Files.readAllLines(path);
        lines.forEach(System.out::println);
    }
    
}
