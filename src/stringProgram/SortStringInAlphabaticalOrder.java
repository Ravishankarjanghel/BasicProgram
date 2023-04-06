package stringProgram;

import java.util.Arrays;

public class SortStringInAlphabaticalOrder {

	public static void main(String[] args) {
		String s = "zyxwvutsrqponmlkjihgfedcba";
		char temp;
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}

			}
		}
		String s1 = new String(ch);
		System.out.println(s1);
		char[] ch1 = s.toCharArray();
		Arrays.sort(ch1);
		String s2 = new String(ch);
		System.out.println(s2);
	}
}
