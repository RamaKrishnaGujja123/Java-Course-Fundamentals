package Collections;
import java.util.LinkedList;
import  java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        // Queue - FIFO or Custom order
        // 2 Implimentaions
        //1. LinkedList - same as list and queue
        //2.Priority Queue - Priority Orders

        Queue<String> Orders = new LinkedList<>();
        Orders.add("Order 1");
        Orders.add("Order 2");
        Orders.add("Order 3");
        
        System.out.println(Orders.poll());
    }
    
}
