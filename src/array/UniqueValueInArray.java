package array;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class UniqueValueInArray {

	public static void main(String[] args) {
		int[] a = { 0, 0, 0, 1, 2, 1, 0, 3, 4, 5, 5, 5, 4, 6, 7, 8 };

		LinkedHashMap<Integer, Integer> oc = new LinkedHashMap<Integer, Integer>();
		for (int i : a) {
			if (!oc.containsKey(i))
				oc.put(i, 1);
			else
				oc.put(i, oc.get(i) + 1);

		}
		System.out.println(oc);
		ArrayList<Integer> unique = new ArrayList<Integer>();
		for(Integer i:oc.keySet()) {
			if(oc.get(i)==1) {
				unique.add(i);
			}
		}
		System.out.println(unique);
		System.out.println(unique.get(4));
	}
	
}
