package stringProgram;

public class RemoveSpecialCharacter2 {

	public static void main(String[] args) {
		String s = "My name is Ravishankar, I live in Bangalore, I am a Software Engineer. I completed my B.E.(Computer-Science) in 2015.";
		s = s.replaceAll("[^0-9a-zA-Z ]", "");
		System.out.println(s);
	}
}
