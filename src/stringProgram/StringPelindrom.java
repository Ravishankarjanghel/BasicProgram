package stringProgram;

public class StringPelindrom {

	public static void main(String[] args) {
		String s = "BaafB";
		String rev = revStr(s);
		if(s.equals(rev))
			System.out.println("Pelindrom.");
		else
			System.out.println("Not Pelindrom.");
	}
	private static String revStr(String s) {
		int n = s.length();
		String rev = "";
		for(int i = n-1;i>=0;i--) {
			rev = rev + s.charAt(i);
		}
		return rev;
	}

}
