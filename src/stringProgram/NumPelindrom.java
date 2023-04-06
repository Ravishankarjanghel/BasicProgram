package stringProgram;

public class NumPelindrom {

	public static void main(String[] args) {
		int num = 1231121;
		String sNum = Integer.toString(num);
		int rev = reverse(num);
		System.out.println(num +" = "+rev);
		String revSNum = "";
		int n = sNum.length();
		for(int i = n-1; i>=0 ;i--) {
			revSNum = revSNum+sNum.charAt(i);
		}
		int revNum = Integer.parseInt(revSNum);
		if(num == revNum)
			System.out.println("Pelindrom.");
		else
			System.out.println("Not Pelindrom.");
	}

	private static int reverse(int num) {
		int n = num;
		int rev = 0;
		while(n>0) {
			int t = n%10;
			rev = rev*10+t;
			n=n/10;
		}
		return rev;
	}
}
