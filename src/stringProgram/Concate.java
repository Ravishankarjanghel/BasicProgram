package stringProgram;

public class Concate {

	public static void main(String[] args) {
		String s = "ABC";
		String s1 = "XYZ";
		String s2 = "PQR";
		System.out.println(s.concat(s1).concat(s2));
		System.out.println(s);
		System.out.println(s+s1+s2);
		StringBuffer sb = new StringBuffer(s);
		StringBuffer sb1 = new StringBuffer(s1);
		StringBuffer sb2= new StringBuffer(s2);
		sb.append(sb1).append(sb2);
		System.out.println(sb);
	}
}
