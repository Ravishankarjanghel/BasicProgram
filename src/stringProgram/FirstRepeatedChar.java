package stringProgram;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class FirstRepeatedChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		LinkedHashSet<Character> ch = new LinkedHashSet<Character>();
		char repeated = '\u0000';
		for(int i = 0;i<str.length();i++) {
			if(ch.contains(str.charAt(i))) {
				repeated = str.charAt(i);
				break;
			}
			else
				ch.add(str.charAt(i));
		}
		System.out.println(repeated);
		System.out.println(ch);
	}

}
