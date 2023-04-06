package CollectionFramework;

import java.util.LinkedList;

public class LinkExample {
	public static void main(String[] args) {
		LinkedList ob = new LinkedList();
		
		ob.add(100);
		ob.add("Ravi");
		ob.add(1,'A');
		System.out.println(ob);
		
		for(Object i : ob)
			System.out.println(i);
	}
}
