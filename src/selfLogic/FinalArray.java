package selfLogic;

public class FinalArray {

	public static void main(String[] args) {
		final int[] a = new int[50];
		for(int i=0;i<a.length;i++) {
			a[i] = i;
		}
		for(int i : a) {
			System.out.println(i);
		}
	}

}
