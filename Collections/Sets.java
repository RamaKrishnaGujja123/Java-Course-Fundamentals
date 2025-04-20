package Collections;
import java.util.*;

public class Sets {
    public static void main(String[] args) {
// Sets are Unorderd and duplicates are not allowed
// 3 types of implimentation
// 1.Hashset unorderd and fast lookup
// 2.Linkedhashset ordered and slow
// 3.Treeset sorted

        Set<String> cities = new HashSet<>();
        cities.add("Wgl");
        cities.add("Hyd");
        cities.add("Wgl"); // ignored
        cities.add("Chicago");

        System.err.println(cities);
        }
    
}
