package stringProgram;

import java.util.ArrayList;

public class ReverseSentence {

	public static void main(String[] args) {
		String s = "My name is Ravi.";
		s = s.replace(".", "");
		System.out.println(s);
		String[] s1 = s.split(" ");
		String rev = "";
		for(int i = s1.length-1;i>=0;i--) {
			rev = rev + s1[i] + " ";
		}
		System.out.println(rev);
	}

}
