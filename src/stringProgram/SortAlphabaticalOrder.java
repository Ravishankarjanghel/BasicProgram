package stringProgram;

public class SortAlphabaticalOrder {

	public static void main(String[] args) {
		String s = "zkdk afhd xkdkd ysysy bshsh chsjs";
		String[] ch = s.split(" ");
		String sorted = "";
		String temp;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i].charAt(i) != ch[j].charAt(j)) {
					if (ch[i].charAt(0) > ch[j].charAt(0)) {
						temp = ch[i];
						ch[i] = ch[j];
						ch[j] = temp;
					}
				}
				else {
					
				}
			}
		}
		for (String c : ch) {
			sorted = sorted + c + " ";
		}
		System.out.println(s);
		System.out.println(sorted);
	}

}
