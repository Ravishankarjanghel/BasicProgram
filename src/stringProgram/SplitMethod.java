package stringProgram;

public class SplitMethod {

	public static void main(String[] args) {
		String s = "Ramya        reddy            raghu       riza sandeep";
		String[] s1 = s.split(" ");
		String s2 = "";
		for(String i:s1) {
			if(i.length() != 0) {
				s2 = s2+i+ " ";
			}
		}
		System.out.println(s);
		System.out.println(s2);
	}
}
