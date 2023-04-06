package stringProgram;

public class SaperateCharOfString {

	public static void main(String[] args) {
		String s = "Mocha";
		char[] c = s.toCharArray();
		String s1 = "";
		for(char ch : c) {
			s1=s1 + ch + " ";
		}
		System.out.println(s1.trim());
	}

}
