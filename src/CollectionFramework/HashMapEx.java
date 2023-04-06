package CollectionFramework;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, Object> hm = new HashMap<String,Object>();
		hm.put("Fname", "Ravishankar");
		hm.put("Lname", "Janghel");
		hm.put("Age", "30");
		hm.put("Contact", 9199273772l);
		hm.put("Place", "ISK-23");
		hm.put("Favorite Actress", "Luciana Carro");
		//hm.put(null ,"XYZ");	------> this is correct statement.
		//hm.put("xyz", null);	------> this is correct statement.
		//hm.put(null,null);	------> this is correct statement.
		
		System.out.println("Entries of hm");
		System.out.println(hm);
		
		HashMap<String, Object> hm1 = new HashMap<String,Object>();
		hm1.put("planet", "Mars");
		hm1.put("State", "IS-1278");
		hm1.put("Country", "I-198");
		
		System.out.println("Enteries of hm1");
		System.out.println(hm1);
		
		System.out.println("After putAll : ");
		hm.putAll(hm1);
		System.out.println(hm);
		
		System.out.println("get() method : ");
		System.out.println(hm.get("Fname"));
		System.out.println(hm1.get("Planet"));
		
		System.out.println("keySet() method : ");
		System.out.println(hm.keySet());
		System.out.println(hm1.keySet());

		System.out.println("value() method : ");
		System.out.println(hm.values());
		System.out.println(hm1.values());

		System.out.println(hm.entrySet());
		System.out.println(hm1.entrySet());	//(1)
		//System.out.println(hm1);			//(2)
		//output of (1) and (2) is same.
		
		System.out.println(hm.remove("Favorite Actress"));//output - Luciana Carro
		System.out.println(hm.remove("favorite actress"));//output - null
		
		System.out.println(hm.containsKey("Fname"));
		System.out.println(hm.containsKey("Luna"));
		
		System.out.println(hm.containsValue("Ravishankar"));
		System.out.println(hm.containsValue("Luna"));
		
		hm.putIfAbsent("Fname","Ravishankar");
		hm.putIfAbsent("Planet","ABC-123");
		hm.putIfAbsent("Sub-Planet","Glonass");
		
		System.out.println(hm);	
	}
}
