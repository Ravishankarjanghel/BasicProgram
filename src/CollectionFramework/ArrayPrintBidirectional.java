package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayPrintBidirectional {

	public static void main(String[] args) {
		ArrayList<Object> ob = new ArrayList<Object>();
		ob.add(100);
		ob.add(120.55f);
		ob.add('A');
		ob.add("Ravi");
		ob.add(true);

		ListIterator<Object> i = ob.listIterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
		
		
	}

}
