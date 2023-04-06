package stringProgram;

public class WordCountWithTrim {

	public static void main(String[] args) {
		String s = "   My name is Ravi. I am a student.";

		char[] ch = s.toCharArray();
		int count=0;
		for(int i = 0;i<ch.length;i++) {
			if(i==0&&ch[i]!=' '||ch[i]!=' ' && ch[i-1]==' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
