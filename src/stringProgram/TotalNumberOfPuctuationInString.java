package stringProgram;

public class TotalNumberOfPuctuationInString {

	public static void main(String[] args) {
		String s = "My name is Ravi. I live in banglore, 'banglore' is \"big city\"; hi! how are you?";
		int len = s.replaceAll("[^,.?;:'\"!]", "").length();
		System.out.println(len);
		
		int c = 0;
		String s1 = "^,.?;:'\"!";
		for(int i = 0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(s1.contains(""+ch)) {
				c++;
			}
		}
		System.out.println(c);
		  
	}

}
