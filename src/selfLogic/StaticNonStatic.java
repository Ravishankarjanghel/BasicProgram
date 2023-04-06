package selfLogic;

public class StaticNonStatic {

	public static void main(String[] args) {
		ex();

	}
	public static void ex() {
		Aa a = new Aa();
		a.add();
		Aa.sub();
		a.mul();
	}

}

class Aa{
	public void add() {
		System.out.println("hello");
	}
	
	public static void sub() {
		System.out.println("Hi");
	}
	
	public void mul() {
		add();
		System.out.println("take care.");
	}
}
