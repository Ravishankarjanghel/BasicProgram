package CollectionFramework;
import java.util.*;
public class HashSetRemove {

	public static void main(String[] args) {
		HashSet<Object> ob = new HashSet<Object>();
		ob.add(100);
		ob.add("Ravi");
		ob.add('A');
		ob.add("Btm");
		ob.add(120.3f);
		ob.add(123456789l);
		
		System.out.println(ob);
		
		ob.remove("Btm");
		
		System.out.println(ob);

	}

}
