package array;

import java.util.Scanner;

public class LongerStr {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		int n = sc.nextInt();
		String w[] = new String[n];
		
		System.out.println("Enter the "+n+" number of element in array : ");
		for(int i = 0; i<w.length;i++){
			w[i] = sc.next();
		}
		Object ob[] = getResult(w);
		System.out.println("longest word is "+ ob[0]+ " at position " + ob[1] +" and lenght is "+ ob[2]);
	}
	
	public static Object[] getResult(String str[]) {
		
		Object ob[] = {null,0,str[0].length()};

		for(int i = 1; i<str.length;i++){
			if((str[i].length()) > (int)(ob[2])) {
				ob[2] = str[i].length();
				ob[1] = i;
				ob[0] = str[i];
			}
		}
		return ob;
	}
}
