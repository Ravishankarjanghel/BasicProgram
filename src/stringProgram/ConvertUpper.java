package stringProgram;

public class ConvertUpper {

	public static void main(String[] args) {
		String s = "RaviShankar";
		char[] charArr = s.toCharArray();
		
		for(int i = 0;i<charArr.length;i++) {
			if(charArr[i]>='a' && charArr[i]<='z') {
				charArr[i] = (char) (charArr[i] - 32);
			}
		}
		String s1 = new String(charArr);
		System.out.println(s +"  "+s1);
	}
}
