package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(32);
		al.add(23);
		al.add(90);
		al.add(67);
		al.add(75);
		al.add(89);
		al.add(36);
		
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
	}

}
