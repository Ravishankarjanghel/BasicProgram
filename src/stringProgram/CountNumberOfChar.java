package stringProgram;

public class CountNumberOfChar {

	public static void main(String[] args) {
		String s = "abd123,23rty.iorAFGLKK";//abdrtyiorAFGLKK
		int numOfChar = s.replaceAll("[^a-zA-Z]", "").length();
		System.out.println("1St method"+numOfChar);
		
		//using derived.
		int c = 0;
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z')
				c++;
		}
		System.out.println("2nd "+c);
	}

}
