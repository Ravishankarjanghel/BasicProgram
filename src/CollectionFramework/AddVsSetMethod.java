package CollectionFramework;

import java.util.ArrayList;

public class AddVsSetMethod {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(102);
		al.add(100);
		al.add(130);
		al.add(125);
		al.add(132);
		System.out.println(al);

		al.add(5, 190);
		System.out.println(al);

		al.add(4,180);
		
		
		System.out.println(al);
		al.set(4, 125);
		System.out.println(al);
		System.out.println(al.indexOf(125));
		System.out.println(al.lastIndexOf(125));
		al.remove(1);
		System.out.println(al);
		
		
	}

}
