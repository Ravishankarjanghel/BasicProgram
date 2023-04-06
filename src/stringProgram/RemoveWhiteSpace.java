package stringProgram;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String s = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
		String s2 = "";
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				s2 = s2+s.charAt(i);
			}
		}
		System.out.println(s);
		System.out.println(s2);
		String[] str = s.split(" ");
		String str1 = "";
		for(String i:str) {
			str1 = str1+i;
		}
		
		System.out.println(str1);
	}

}
