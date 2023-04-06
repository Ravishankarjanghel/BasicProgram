package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompareTwoAL {

	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al1.add(10);
		al1.add(9);
		al1.add(45);
		al1.add(98);
		al1.add(30);
		
		al2.add(10);
		al2.add(19);
		al2.add(45);
		al2.add(98);
		al2.add(30);
		
		if(al1.containsAll(al2)) {
			System.out.println(true);
		}
		else
			System.out.println(false);
	}

}
