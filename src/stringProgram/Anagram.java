package stringProgram;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "Peel";
		String s2 = "Elep";
		char[] ch1 = s1.toLowerCase().toCharArray();
		char[] ch2 = s2.toLowerCase().toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

//		s1 = new String(ch1);
//		s2 = new String(ch2);
//		
//		if(s1.equals(s2)) {
//			System.out.println("String is Anagram.");
//		}
//		else {
//			System.out.println("String is not Anagram.");
//		}
		if (Arrays.equals(ch1, ch2)) {
			System.out.println("String is Anagram.");
		} else {
			System.out.println("String is not Anagram.");
		}
	}
}
