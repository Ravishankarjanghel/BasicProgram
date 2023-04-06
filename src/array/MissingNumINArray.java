package array;

public class MissingNumINArray {

	public static void main(String[] args) {
		int[] arr = {1,5,6,9,7,3,4,8};
		int n = arr.length;
		int missing = missingNum(arr,n);
		System.out.println("Missing Number is : "+ missing);
	}
	private static int missingNum(int[] arr, int n) {
		int[] temp = new int[n+1];
//		for(int i = 0; i<temp.length;i++) {
//			temp[i] = 0;
//		}
		
		for(int i = 0;i<n;i++) {
			temp[arr[i]-1] = 1;
		}
		int ans=0;
		for(int i = 0;i<temp.length;i++) {
			if(temp[i]==0)
				ans = i+1;
		}
		return ans;
	}

}
