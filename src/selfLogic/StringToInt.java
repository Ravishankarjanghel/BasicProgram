package selfLogic;

public class StringToInt {

	public static void main(String[] args) {
		String s = "Test123456";
		String n = s.replaceAll("[^0-9]", ""); 
		System.out.println("String : "+s+" has Integer value "+n);
		

	}

}
