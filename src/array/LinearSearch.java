package array;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter "+n+" element of the array : ");
		
		for(int i = 0; i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the number to be searched : ");
		int num = sc.nextInt();
		
		//linear Search.
		if(linearSearch(a, num) == -1) 
			System.out.println("Number "+num+" is not present in array.");
		else
			System.out.println("number "+num+" present in position "+ linearSearch(a, num)+ " and content is "+ a[linearSearch(a, num)]);
	}
	
	public static int linearSearch(int a[], int num) {
		for(int i = 0; i<a.length; i++) {
			if(a[i]==num) return i;
		}
		
		return -1;
	}
}
