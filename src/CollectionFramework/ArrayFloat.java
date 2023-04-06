package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayFloat {
	
	
	public static void main(String[] rgs) {
		ArrayList<Float> ob = new ArrayList<Float>();
		ob.add(106.5f);
		ob.add(105.5f);
		ob.add(110.5f);
		ob.add(107.5f);
		ob.add(10.2f);
		
		System.out.println("print by for each : ");
		int j = 0;
		for(Float i : ob) {
			
			System.out.println("in position "+j+ " : " +i);
			j++;
		}
		System.out.println("print by for : ");
		j = 0;
		for(int i = 0; i<ob.size();i++) {
			System.out.println("in position "+j+ " : " +ob.get(i));
		}
		
		System.out.println("is 2.5 present or not : "+ob.contains(105.5f));
		
		System.out.println("adding 10.2 in index 3: ");
		ob.add(3, 10.2f);
		
		System.out.println(ob);
		
		Collections.sort(ob);
		for(Float i : ob) {
			System.out.println(i);
		}
	}
}
