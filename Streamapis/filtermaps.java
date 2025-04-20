package Streamapis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filtermaps {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Bheem","Raj", "Katraj");

        // now using Stream apis Filter and map
        List<String> result = names.stream()
                                   .filter(name -> name.startsWith("R"))
                                   .map(String::toUpperCase)
                                   .collect(Collectors.toList());
        System.out.println(result);

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        int sum = num.stream()
                     .reduce(0,(a,b) -> a + b);
        System.out.println("The sum of num is - " + sum);
    }
}
