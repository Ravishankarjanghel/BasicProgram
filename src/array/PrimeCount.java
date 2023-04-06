package array;

import java.util.Scanner;

public class PrimeCount {
	
	public static int checkPrime(int n) {
		int c = 1;
		if(n==1||n==0)return 0;
		else if(n==2) return c;
		else {
			for(int i = 2; i<=n/2; i++) {
				if(n%i == 0) {
					c = 0;
					break;
				}
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter "+n+" element of the array : ");
		
		for(int i = 0; i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		//for checking the prime.
		int count = 0;
		for(int i = 0; i< a.length; i++) {
			count = count + checkPrime(a[i]);
		}
		System.out.println("Number of prime number in array is "+ count);
	}
}
