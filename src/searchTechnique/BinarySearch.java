package searchTechnique;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = {10,29,35,41,49,53,57,65,78,91};
		int n = 3;
		
		int index = binary(a,n);
		
		System.out.println("Number "+n+" is found in position "+index+".");
	}

	public static int binary(int[] a, int n) {
		int start = 0;
		int ans = -1;
		int end = a.length-1;
		int mid =  (start+end)/2;
		while(start <= end) {
			if(a[mid]==n)
				ans =  mid;
			if(a[mid] < n)
				start = mid+1;
			else
				end = mid-1;	
			mid =  (start+end)/2;
		}
		return ans;
	}

}
