package stringProgram;

import java.util.Scanner;

public class WordCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		int count ;
//		System.out.println(s == "ravi");
		if(s.length() == 0||(s.length()== 1 && s.equals(" "))) {
			count = 0;
			System.out.println("Number of word : "+ count);
		}
		else {
			count = 1;
			for(int  i = 0; i<s.length()-1; i++) {
				
				if(s.charAt(i) == ' ' && s.charAt(i+1)!=' ')
					count++;
			}
			System.out.println("Number of word : "+ count);
		}	
		sc.close();
	}
}
