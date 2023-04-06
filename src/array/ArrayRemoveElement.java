package array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayRemoveElement {
	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 0;i<a.length;i++)
			al.add(a[i]);
		
		System.out.println(al);

		Iterator<Integer> it = al.iterator();
		
		while(it.hasNext()) {
			if(it.next()==20) 
				it.remove();
		}
		System.out.println(al);
	}

}
