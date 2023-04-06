package stringProgram;

import java.util.Scanner;

public class ExtractCharFromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "I love Meganfox";
		System.out.println("Enter the character which you Want to Extract.");
		char ch = sc.next().charAt(0);
		int flag = 0,i;
		for(i = 0; i<s.length();i++) {
			if(s.charAt(i)==ch) {
				flag = 1;
				break;
			}
		}
		
		if(flag == 0) {
			System.out.println("Character "+ ch +" is not present.");
		}
		else {
			System.out.println("Character "+ ch +" is present at position "+ i +".");
		}
	}
}
