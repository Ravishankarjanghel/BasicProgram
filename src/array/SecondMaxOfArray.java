package array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMaxOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		//Arrays.sort(arr);
		//System.out.println("Second max : "+ arr[n-2]);
		
//		int min =arr[0];
//		
//		for(int i = 0 ; i<n-1; i++) {
//			for(int j = i+1; j<n; j++) {
//				if(arr[i]<arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		System.out.println("2nd max : "+arr[1]);
		
		
	}
}
