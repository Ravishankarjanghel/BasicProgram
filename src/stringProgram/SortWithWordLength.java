package stringProgram;

public class SortWithWordLength {

	public static void main(String[] args) {
		String s = "asd hddj j kfkff jgjf ldlddd jd lddl";
		String[] ch = s.split(" ");
		String sorted = "";
		String temp;
		for(int i = 0;i<ch.length;i++) {
			for(int j = i+1;j<ch.length;j++) {
				if(ch[i].length()>ch[j].length()) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		for(String c:ch) {
			sorted = sorted + c+ " ";
		}
		System.out.println(s);
		System.out.println(sorted);
	}
}
