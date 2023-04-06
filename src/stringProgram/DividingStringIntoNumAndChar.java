package stringProgram;

public class DividingStringIntoNumAndChar {

	public static void main(String[] args) {
		String s = "a1b2c3";
		System.out.println(s);
		char[] arr1 = s.replaceAll("[^a-zA-Z]", "").toCharArray();//"abc".toCharArray()
		char[] arr2 = s.replaceAll("[^0-9]", "").toCharArray();
		
		for(char i : arr1) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(char i : arr2) {
			System.out.print(i+" ");
		}
	}
}
