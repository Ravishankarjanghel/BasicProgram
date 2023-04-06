package stringProgram;

public class LengthWithoutPredefineMethod {

	public static void main(String[] args) {
		String s = "I love my India";
		int count = 0;
		char[] ch = s.toCharArray();
		for(char c : ch) {
			count++;
		}
		System.out.println("Length of string : "+ count);
	}

}
