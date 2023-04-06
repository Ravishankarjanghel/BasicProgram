package selfLogic;

public class MainOverload {

	public static void main(String[] args) {
		MainOverload mo = new MainOverload();
		System.out.println(mo.main("This is Ravi."));
		mo.main(20, 30);
		mo.main("Ravi", "shankar");
		mo.main();
		main();
		System.out.println(mo.main(30, "Ravishankar"));
	}
	public void main(int a, int b) {
		System.out.println("Addition is : "+ (a+b));
	}
	
	public void main(String s1,String s2) {
		System.out.println("Concatination is : "+ (s1+s2));
	}
	
	public String main(String s){
		return "\" "+s+" \" " + " is returned.";
	}
	
	public static void main() {
		System.out.println("This is static main method, without return-type.");
	}
	public String main(int age,String s) {
		return "Hello, "+s+" Your age is : "+age;
	}
}
