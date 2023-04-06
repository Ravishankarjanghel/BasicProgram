package CollectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ExecuteVehicle {

	public static void main(String[] args) {
		ArrayList<Vehicle> al = new ArrayList<Vehicle>();
		al.add(new Bike(125000l,"ROYAL ENFIELD","HUNTER",45.7f));
		al.add(new Bike(250000l,"BAJAJ","DOMINOR",35.7f));
		al.add(new Bike(155000l,"YAMAHA","FZ-v3",43.5f));
		al.add(new Car(1124000l,"MARUTI-SUZUKI","BREZZA",23.3f));
		al.add(new Car(1236000l,"MAHINDRA","XUV-300",19.2f));
		al.add(new Car(1221000l,"TATA","NEXON",19.2f));
		al.add(new Car(3230000l,"MAHINDRA","XUV-700",14.2f));
		
		//System.out.println(al);
		ListIterator<Vehicle> i = al.listIterator();
		
		System.out.println("Forward Direction Printing : ");
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("Backward Direction Printing : ");
		
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
		
		System.out.println("Printing from 3rd Index : ");
		ListIterator<Vehicle> i1 = al.listIterator();
		
		System.out.println("Backward Direction Printing from 3rd Index : ");
		
		while(i1.hasPrevious()) {
			System.out.println(i1.previous());
		}
		
		System.out.println("Forward Direction Printing from 3rd Index : ");
		ListIterator<Vehicle> i2 = al.listIterator(3);
		
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		
		
	}

}
