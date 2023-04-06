package CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Conversion {

	public static void main(String a[]) {
		// Create new List
		List<String> fruitlist = new ArrayList<String>();
		fruitlist.add("Mango");
		fruitlist.add("Apple");
		fruitlist.add("Grape");
		fruitlist.add("Papaya");

		// Printing ArrayList
		System.out.println("Fruit List : " + fruitlist);

		// Create a TreeSet with the list
		TreeSet<String> tree_set = new TreeSet<String>(fruitlist);

		// Print TreeSet
		System.out.println("TreeSet from List : " + tree_set);
	}

}
