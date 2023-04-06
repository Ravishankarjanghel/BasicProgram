package stringProgram;

import java.util.Scanner;

public class CountSpecial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		
		System.out.println("number of special character in string : "+ specialCount(s));
		sc.close();
	}
	
	public static int specialCount(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='0'&& s.charAt(i)<='9') {}
			else if(s.charAt(i)>='a'&& s.charAt(i)<='z') {}
			else if(s.charAt(i)>='A'&& s.charAt(i)<='Z') {}
			else count++;
		}
		
		return count;
	}
}
