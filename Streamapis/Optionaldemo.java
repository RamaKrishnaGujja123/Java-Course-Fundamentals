package Streamapis;

import java.util.Optional;

public class Optionaldemo {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Java");

        name.ifPresent(System.out::println);

        String Defaultname = name.orElse("Default");
        System.out.println(Defaultname);

    }
    
}
