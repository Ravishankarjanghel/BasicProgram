package array;

import java.util.Scanner;

public class MargeZigZac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MargeZigZac c = new MargeZigZac();
		System.out.println("Enter the first array : ");
		int a[] = c.readArray();
		
		System.out.println("Enter the second array : ");
		int b[] = c.readArray();
		
		System.out.println("User Entered first Array : ");
		c.getArray(a);
		
		System.out.println("User Entered second Array : ");
		c.getArray(b);
		
		int d[] = c.margeZigZac(a, b);
		
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
	public int[] margeZigZac(int a[], int b[]) {
		int n = a.length+ b.length, p=0,q=0;
		int c[] = new int[n];
		for(int i = 0; i<n; i++) {
			while(i<=a.length)
			if(i % 2 == 0) {
				c[i] = a[p];
				p++;
			}
			else {
				c[i] = b[q];
				q++;
			}
		}
		return c;
	}
}
