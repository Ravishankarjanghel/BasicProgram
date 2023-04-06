package stringProgram;

public class RemovePerticularPosition {

	public static void main(String[] args) {
		String s1 = "Hello Java";
		String replaced = replaceChar(s1,7);
		System.out.println(replaced);
		
		//System.out.println(s1.replace(String.valueOf(s1.charAt(7)), ""));
	}


	public static String replaceChar(String s1, int i) {
		return s1.substring(0, i)+s1.substring(i+1);
	}

}
