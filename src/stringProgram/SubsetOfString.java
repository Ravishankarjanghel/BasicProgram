package stringProgram;

public class SubsetOfString {

	public static void main(String[] args) {
		String s = "123";
		
		int len = s.length();
		int temp = 0;
		int n = (len*(len+1))/2;
		String[] sub = new String[n];
		for(int i = 0;i<len;i++) {
			for(int j = i;j<len;j++) {
				String s1 = s.substring(i, j+1);
				sub[temp]= s1;
				temp++;
			}
		}
		for(String i : sub) {
			System.out.println(i);
		}
	}

}
