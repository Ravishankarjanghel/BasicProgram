package stringProgram;

import java.util.ArrayList;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		String s = "My name is Ravishankar, I live in Bangalore, I am a Software Engineer. I completed my B.E.(Computer-Science) in 2015.";
		char[] ch = s.toCharArray();
		ArrayList<Character> arrCh = new ArrayList<Character>();
		for(int i = 0;i<s.length();i++) {
			char c = ch[i];
			if(!(c>=37&&c<=47||c>=58&&c<=64||c>=91&&c<=96||c>=123&&c<=126)) {
				arrCh.add(c);
			}
		}
		Object[] ch1 = arrCh.toArray();
		String s2 = "";
		for(int i =0;i<ch1.length;i++) {
			s2 = s2+ch1[i];
		}
		System.out.println(s2);
	}

}
