package selfLogic;

public class UpcastDowncast {

	public static void main(String[] args) {
		X xy = new Y();
		detail(xy);
		Z xz = new Z();
		detail(xz);
		X x = new X();
		detail(x);
		
		

	}
	
	public static void detail(X ob) {
		if(ob instanceof Y) {
			ob.print();
			((Y)ob).yP();
		}
		else if(ob instanceof Z) {
			ob.print();
			((Z)ob).zP();
		}	
		else {
			ob.print();
			ob.xP();
		}
		
	}

}
