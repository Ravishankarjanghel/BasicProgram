package array;

import java.util.Scanner;

public class DiffBigSmall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter "+n+" element of the array : ");
		
		for(int i = 0; i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		int bs[] = bigSmallDiff(a);
		System.out.println("Difference between Biggest and Smallest element "+ (bs[0]-bs[1]));
	}
	public static int[] bigSmallDiff(int a[]) {
		int bs[] = {a[0],a[1]};
		for(int i = 0; i<a.length;i++) {
			if(a[i]>bs[0]) {
				bs[0] = a[i];
			}
			if(a[i]<bs[1]) {
				bs[1] = a[i];
			}
		}
		return bs;
	}
}
