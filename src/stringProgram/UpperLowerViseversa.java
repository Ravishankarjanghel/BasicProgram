package stringProgram;

public class UpperLowerViseversa {

	public static void main(String[] args) {
		String s = "Great <> India.";
		int n = 0;
		char[] c = new char[s.length()];
		for(int i = 0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='a'&&ch<='z') {
				c[n] = (char) (ch-32);
				n++;
			}
			else if(ch>='A'&&ch<='Z') {
				c[n] = (char) (ch+32);
				n++;
			}
			else {
				c[n] = ch;
				n++;
			}
		}
		s= new String(c);
		System.out.println(s);

	}

}
