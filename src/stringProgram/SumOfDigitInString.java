package stringProgram;

public class SumOfDigitInString {

	public static void main(String[] args) {
		String str = "gdhhfh123456";
		char[] strArr = str.toCharArray();
		int sum = 0;
		for(char i : strArr) {
			if(i>='0' && i<='9') {
				sum= sum+i-48;
			}
		}
		System.out.println(sum);
	}
}
