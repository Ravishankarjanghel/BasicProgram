package matrix;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num of row.");
		int row = sc.nextInt();
		System.out.println("Enter the num of column.");
		int col = sc.nextInt();
		int[][] mat = new int[row][col];
		System.out.println("Enter the element in matrix.");
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int[][] trans = new int[col][row];
		
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				trans[j][i]= mat[i][j];
			}
		}
		System.out.println("Transposed Matrix is.");
		for(int i = 0;i<col;i++) {
			for(int j = 0;j<row;j++) {
				System.out.print(trans[i][j]+" ");
			}
			System.out.println();
		}
	}

}
