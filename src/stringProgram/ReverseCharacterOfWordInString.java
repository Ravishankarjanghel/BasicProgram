package stringProgram;

public class ReverseCharacterOfWordInString {

	public static void main(String[] args) {
		String s = "Bangalore is capital of Karnataka";
		System.out.println(s);
		String[] s1 = s.split(" ");
		s="";
		for(int i = 0;i<s1.length;i++) {
			s1[i] = reverse(s1[i]);
			s = s+s1[i]+" ";
		}
		s = s.trim();
		System.out.println(s);
	}
//Method to Reverse The String.
	public static String reverse(String string) {
		String s = "";
		for(int i = string.length()-1;i>=0;i--) {
			s = s+string.charAt(i);
		}
		return s;
	}
}
