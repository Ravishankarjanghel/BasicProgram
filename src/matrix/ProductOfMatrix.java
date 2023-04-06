package matrix;

public class ProductOfMatrix {

	public static void main(String[] args) {
		int[][] mat1 = {
				{1,2,3},
				{4,5,6}
		};
		int[][] mat2 = {
				{1,4},
				{2,5},
				{3,6}
		};
		
		int col1 = mat1[0].length;
		int row1 = mat1.length;
		int col2 = mat2[0].length;
		int row2 = mat2.length;
		
		int[][] product = new int[row1][col2];
		
		if(col1 != row2 && col2 != row1) {
			System.out.println("product is not possible.");
		}
		else {
			for(int i = 0; i < row1; i++){    
                for(int j = 0; j < col2; j++){    
                    for(int k = 0; k < row2; k++){    
                       product[i][j] = product[i][j] + mat1[i][k] * mat2[k][j];     
                    }    
                }    
            }    
		}
		for(int i = 0; i < row1; i++){    
            for(int j = 0; j < col2; j++){    
               System.out.print(product[i][j] + " ");    
            }    
            System.out.println();    
        }    
	}

}
