package stringProgram;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.next();
		String strRev = "";
		int len = str.length();
		for(int i = len-1;i>=0;i--) {
			strRev = strRev+str.charAt(i);
		}
		System.out.println(strRev);
	}

}
