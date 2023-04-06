package stringProgram;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		String s = "aaaabbbbccccddddeeeefffffggggghhhhh";
		String s1 = "";
		for(int i = 0;i<s.length();i++) {
			if(!(s1.contains(""+s.charAt(i)))) {
				s1 = s1+s.charAt(i);
			}
		}
		System.out.println(s1);
	}
}
