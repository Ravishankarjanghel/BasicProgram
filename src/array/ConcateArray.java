package array;

import java.util.Scanner;

public class ConcateArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ConcateArray c = new ConcateArray();
		System.out.println("Enter the first array : ");
		int a[] = c.readArray();
		
		System.out.println("Enter the second array : ");
		int b[] = c.readArray();
		
		System.out.println("User Entered first Array : ");
		c.getArray(a);
		
		System.out.println("User Entered second Array : ");
		c.getArray(b);

//		int n d[];
//		do {
//			System.out.println("Enter your choice: ");
//			System.out.println("If you want First array come before then enter 1 : ");
//			System.out.println("If you want second array come before then enter 2 : ");
//			n = sc.nextInt();
//			if(n == 1)
//				d[] = c.margeArray(a,b); 
//			else if(n == 2)
//				d[] = c.margeArray(b,a);
//			else {
//				System.out.println("Invalid selection, again enter your Choice.");
//			}
//		}while(n==1||n==2);
		int d[] = c.margeArray(a, b);
		
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
	public int[] margeArray(int a[], int b[]) {
		int n = a.length+b.length;
		int c[] = new int[n];
		int i = 0;
		for(int j = 0; j<a.length; j++,i++) {
			c[i] = a[j];
		}
		for(int j = 0; j<b.length; j++,i++) {
			c[i] = b[j];
		}
		return c;
	}
}
