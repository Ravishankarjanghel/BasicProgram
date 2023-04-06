package array;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the order of the matrix : ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int [][]arr = new int[row][col];
		System.out.println("Enter the "+row*col+"value in the Matrix : ");
		
		for(int i = 0 ; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i = 0 ; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int a[][] = new int[col][row];
		System.out.println("After Transpose of Matrix : ");
		for(int i = 0 ; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				a[j][i] = arr[i][j];
			}
		}
		
		for(int i = 0 ; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
