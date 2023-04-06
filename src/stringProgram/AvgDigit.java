package stringProgram;

import java.util.Scanner;

public class AvgDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		
		System.out.println("Average of Digit in string : "+ avgCount(s));
		sc.close();
	}
	
	public static double avgCount(String s) {
		int count = 0;
		double sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='0'&& s.charAt(i)<='9') {
				sum+=(s.charAt(i)-48);
				count++;
			}
		}
		return (double)(sum/count);
	}
}
