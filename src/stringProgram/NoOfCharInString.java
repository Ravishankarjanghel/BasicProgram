package stringProgram;

public class NoOfCharInString {

	public static void main(String[] args) {
		String str = "a bvbc jjd hfjdj jdjdj";
		int c = 0;
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				c++;
			}
		}
		System.out.println("Number of character in Given String : "+c);
		System.out.println("Number of character with Space in Given String : "+str.length());
	}
}
