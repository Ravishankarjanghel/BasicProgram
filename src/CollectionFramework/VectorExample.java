package CollectionFramework;

import java.util.Vector;
import java.util.Collection;
public class VectorExample {

	public static void main(String[] args) {
		
		Vector<Object> v= new Vector<Object>();
		for(int i = 0,n=1 ; i <= 9; i++,n++) {
			v.add(i,n);
		}
		System.out.println(v);
		v.remove(5);
		//v.removeElement(5);
		System.out.println(v);
	}

}
