package matrix;

import java.util.Scanner;

public class IdentityMatrixCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row and column");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		System.out.println("Enter the element in the metrix.");
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int flag = 0;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				if(!(i==j&&mat[i][j]==1||i!=j&&mat[i][j]==0)) {
					flag = 1;
				}
			}
		}
		if(flag == 0) {
			System.out.println("Matrix is identity matrix.");
		}
		else {
			System.out.println("Matrix is not identity matrix.");
		}
	}

}
