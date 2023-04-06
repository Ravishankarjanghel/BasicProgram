package stringProgram;

public class ComapreString {

	public static void main(String[] args) {
		String s1 = "Hello java";
		String s2 = "hello Python";
//		String s1 = "BHUVAN";
//		String s2 = "AMAN";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
	}

}
