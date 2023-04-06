package searchTechnique;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a = {10,29,67,89,65,45,43,78,90,32};
		int n = 78;
		int i;
		boolean flag = false;
		for(i = 0;i<a.length;i++) {
			if(a[i] == n) {
				flag = true;
				break;
			}
		}
		if(flag)
		System.out.println("Number "+ n +"found at position "+i+".");
		else
			System.out.println("Number"+n+"not found.");
	}

}
