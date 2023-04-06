package selfLogic;

public class SingletonClass {

	public static void main(String[] args) {
		A a1 = A.getObject();
		A a2 = A.getObject();
		A a3 = A.getObject();
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
	}
}

class A {
	static A a = new A();
	private A () {}
	
	public static A getObject() {
		return a;
	}
}