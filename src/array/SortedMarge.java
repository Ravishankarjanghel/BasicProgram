package array;

import java.util.Scanner;

public class SortedMarge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SortedMarge c = new SortedMarge();
		System.out.println("Enter the first array : ");
		int a[] = c.readArray();
		
		System.out.println("Enter the second array : ");
		int b[] = c.readArray();
		
		System.out.println("User Entered first Array : ");
		c.getArray(a);
		
		System.out.println("User Entered second Array : ");
		c.getArray(b);
		
		int d[] = c.sortedMarge(a, b);
		
		System.out.println("After marge Array is : ");
		c.getArray(d);

	}
	public void getArray(int[] a) {
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
	}
	public int[] readArray() {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i<n;i++) {
			a[i] = sc.nextInt(); 
		}
		return a;
	}
	
	public int[] sortedMarge(int a[], int b[]) {
		int n = a.length+b.length, p = 0, q = 0;
		int d[] = new int[n];
		
		for(int i = 0; i<n ; i++) {
			int mina = minOf(a);
			int minb = minOf(b);
			if(mina < minb) {
				d[i] = mina;
			}
			else {
				d[i] = minb;
			}
		}
		return d;
	}
	public int minOf(int a[]) {
		int min = a[0];
		for(int i = 1; i<a.length; i++) {
			if(a[i] < min) {
				min = a[i];
			}
		}
		delShift(a, min);
		return min;
	}
	public void delShift(int a[], int min) {
		for(int i = 0; i< a.length; i++) {
			if(min == a[i]) {
				for(int j = i;j<a.length-1;j++) {
					a[i]= a[i+1];
				}
			}
		}
	}
}
