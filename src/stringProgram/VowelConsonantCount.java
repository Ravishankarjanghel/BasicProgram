package stringProgram;

public class VowelConsonantCount {

	public static void main(String[] args) {
		String s = "My name Is Ravi, I am a Software Engineer. I am living in banglore.";
		s = s.toLowerCase();
		int v = 0,cc = 0;
		for(int i = 0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				v++;
			}
			else if(c>'a'&&c<='z') {
				cc++;
			}
		}
		System.out.println("Number of Vowel : "+v);
		System.out.println("Number of Consonant : "+cc);
		

	}

}
