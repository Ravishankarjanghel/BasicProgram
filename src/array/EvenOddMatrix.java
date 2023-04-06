package array;

import java.util.Scanner;

public class EvenOddMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order of Matrix : ");
		int row  = sc.nextInt();
		int col = sc.nextInt();
		
		int [][]arr = new int[row][col];
		
		System.out.println("Enter the "+row*col+"value in the Matrix : ");
		for(int i = 0 ; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int even = 0, odd = 0;
		for(int i = 0 ; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				if(arr[i][j] == 0) {}
				else if(arr[i][j] % 2 == 0) even++;
				else odd++;
			}
		}
		System.out.println("Even number : "+ even+ "\nodd number : "+ odd);

	}

}
