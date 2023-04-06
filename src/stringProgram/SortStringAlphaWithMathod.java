package stringProgram;

import java.util.Arrays;

public class SortStringAlphaWithMathod {

	public static void main(String[] args) {
		String s = "uiahdz";
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		s = new String(ch);
		System.out.println(s);
	}

}
