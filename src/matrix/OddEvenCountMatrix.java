package matrix;

public class OddEvenCountMatrix {

	public static void main(String[] args) {
		int[][] mat = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int odd = 0,even = 0;
		for(int i = 0; i<mat.length;i++) {
			for(int j = 0;j<mat[0].length;j++) {
				if(mat[i][j] % 2 == 0) even++;
				else odd++;
			}
		}
		System.out.println("Odd elements are "+odd+".\nEven elements are "+even+".");
	}

}
