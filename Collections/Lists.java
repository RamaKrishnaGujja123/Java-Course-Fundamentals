package Collections;

import java.util.ArrayList;
import java.util.List;
// Lists are ordered and duplicates allowed

// 3 implimentation types

//1.Array List (Fast access and slow insert or delete)
//2. Linked List(Slow access and fast insert or delete)
//3.Vector (Legacy, thread safe version of arraylist)

public class Lists {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Pear");
		fruits.add("Watermelon");
		fruits.add("Watermelon");

		System.out.println(fruits.get(1));
		System.out.println(fruits.get(1));

	}

}
