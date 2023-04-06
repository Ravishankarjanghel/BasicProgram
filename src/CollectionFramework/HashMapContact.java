package CollectionFramework;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapContact {

	public static void main(String[] args) {
		HashMap<String, Long> hm = new HashMap<String,Long>();
		
		hm.put("Ravi1", 9399399391l);
		hm.put("Ravi2", 9399399392l);
		hm.put("Ravi3", 9399399393l);
		hm.put("Ravi4", 9399399394l);
		hm.put("Ravi5", 9399399395l);
		hm.put("Ravi6", 9399399396l);
		
		System.out.println("All keys : by method ");
		System.out.println(hm.keySet());
		System.out.println();
		System.out.println("All keys : by for each Loop ");
		for(String i : hm.keySet()) {
			System.out.println( i );
		}
		System.out.println();
		System.out.println("All values : by method ");
		System.out.println(hm.values());
		System.out.println();
		System.out.println("All value : by for each Loop ");
		for(String i : hm.keySet()) {
			System.out.println( hm.get(i));
		}
		System.out.println();
		System.out.println("All name and contact number : by for each Loop ");
		for(String i : hm.keySet()) {
			System.out.println( "Contact number of "+ i +" : "+hm.get(i));
		}
		System.out.println();
		System.out.println("All value : by for each Loop ");
		for(Long i : hm.values()) {
			System.out.println(i);
		}
		System.out.println();
		TreeMap<String, Long> tm = new TreeMap<String, Long>(hm);
		
		System.out.println("*************************************************");
		System.out.println("Result for TreeMap : ");
		System.out.println("*************************************************");

		System.out.println("All keys : by method ");
		System.out.println(tm.keySet());
		System.out.println();
		System.out.println("All keys : by for each Loop ");
		for(String i : tm.keySet()) {
			System.out.println( i );
		}
		System.out.println();
		System.out.println("All values : by method ");
		System.out.println(tm.values());
		System.out.println();
		System.out.println("All value : by for each Loop ");
		for(String i : tm.keySet()) {
			System.out.println( tm.get(i));
		}
		System.out.println();
		System.out.println("All name and contact number : by for each Loop ");
		for(String i : tm.keySet()) {
			System.out.println( "Contact number of "+ i +" : "+tm.get(i));
		}
		System.out.println();
		System.out.println("All value : by for each Loop ");
		for(Long i : tm.values()) {
			System.out.println(i);
		}
	}
}
