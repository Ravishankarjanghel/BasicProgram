package matrix;

public class SumRowCol {

	public static void main(String[] args) {
		int[][] mat = {
				{1,2},
				{3,4},
				{5,6}
		};
		
		int col = mat[0].length; 
		int row = mat.length;
 		int[] sumCol = new int[col];
		int[] sumRow = new int[row];
		
		for(int i = 0;i<row;i++) {
			int sum = 0;
			for(int j = 0;j<col;j++) {
				sum = sum+mat[i][j];
			}
			sumRow[i]=sum;
		}
		
		for(int i = 0;i<col;i++) {
			int sum = 0;
			for(int j = 0;j<row;j++) {
				sum = sum+mat[j][i];
			}
			sumCol[i]=sum;
		}
		System.out.println("Sum of element of col.");
		for(int i = 0;i<col;i++) {
			System.out.print(sumCol[i]+" ");
		}
		System.out.println("\nSum of element of row.");
		for(int i = 0;i<row;i++) {
			System.out.println(sumRow[i]+" ");
		}
	}

}
