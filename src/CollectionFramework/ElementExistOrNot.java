package CollectionFramework;

import java.util.ArrayList;

public class ElementExistOrNot {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		al.add(100);
		int n = 20 ;
		if(al.contains(n)) {
			System.out.println("Yes.");
		}
		else
			System.out.println("No.");
	}

}
