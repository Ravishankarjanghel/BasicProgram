package stringProgram;

public class VowelCountConsonantCount {

	public static void main(String[] args) {
		String s = "My name Is Ravi, I am a Software Engineer. I am living in banglore.";
		s = s.toLowerCase();
		int v = 0, c = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					v++;
				else
					c++;
			}
		}
		System.out.println("Vowel : " + v + "\nConsonant : " + c);
	}

}
