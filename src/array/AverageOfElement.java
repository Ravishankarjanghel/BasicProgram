package array;

public class AverageOfElement {
	public static void main(String[] args) {
		int a[] = {11,10,11};
		
		System.out.println("Average of element of array : "+ getAverage(a));
		
	}
	public static double getAverage(int a[]) {
		int sum = 0;
		for(int i = 0; i<a.length; i++) {
			sum = sum + a[i];
		}
		return (double)sum/a.length;
	}
}
