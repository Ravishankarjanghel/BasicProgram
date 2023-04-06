package stringProgram;

import java.util.Scanner;

public class ConvertLower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		char str[] = new char[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch >= 'A'&& ch<='Z') {
				ch += 32;
				str[i] = ch;
			}
			str[i] = ch;
		}
		s="";
		for (int i = 0; i < str.length; i++) {
			s=s+str[i];
		}
		System.out.println(s);
		sc.close();
	}
}
