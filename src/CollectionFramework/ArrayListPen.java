package CollectionFramework;

import java.util.ArrayList;

public class ArrayListPen{


	public static void main(String[] args) {
		Pen p1 = new Pen(2,"Green pen");
		Pen p2 = new Pen(5,"Bekar pen");
		Pen p3 = new Pen(10,"thik Thak pen");
		Pen p4 = new Pen(15,"Achacha pen");
		Pen p5 = new Pen(20,"writoMeter");
		
		ArrayList<Pen> pen = new ArrayList<Pen>();
		pen.add(p1);
		pen.add(p2);
		pen.add(p3);
		pen.add(p4);
		pen.add(p5);
		
		for(Pen p : pen) {
			System.out.println("Information about pen : "+ p);
		}
		System.out.println(pen);
	}

}
