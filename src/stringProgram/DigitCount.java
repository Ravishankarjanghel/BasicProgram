package stringProgram;

import java.util.Scanner;

public class DigitCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		
		System.out.println("number of Digit in string : "+ digitCount(s));
		sc.close();
	}
	
	public static int digitCount(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='0'&& s.charAt(i)<='9') {
				count++;
			}
		}
		
		return count;
	}
}
