package stringProgram;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class SwapLatAndFirstChar {

	public static void main(String[] args) {
		String s = "i love my India";
		String[] str = s.split(" ");
		String s1 = "";
		for (int i = 0; i < str.length; i++) {
			s1 = s1 + swapFirstLast(str[i]) + " ";
		}
		s1 = s1.trim();
		System.out.println(s1);
	}

	public static String swapFirstLast(String s) {
		char f = s.charAt(0);
		char l = s.charAt(s.length() - 1);
		String s1 = l + "";
		for (int i = 1; i < s.length() - 1; i++) {
			s1 = s1 + s.charAt(i);
		}
		if (s.length() != 1)
			s1 = s1 + f;
		return s1;
	}

}
