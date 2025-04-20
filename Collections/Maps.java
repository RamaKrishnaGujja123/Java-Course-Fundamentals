package Collections;
import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // Maps are Key and value pairs like databases and Keys are Unique and values can be duplicates
        //4 types of implimentations
        //1.Hashmap - unordered
        //2.Linked Hash map - ordered
        //3.Treemap - sorted by keys
        //4.Hashtables - Legacy and threadsafe versions
        Map<Integer, String> Students = new HashMap<>();
        Students.put(101, "Ram");
        Students.put(102,"Krishna");
        Students.put(103,"Ram");

        System.out.println(Students.get(101));
    }
}
