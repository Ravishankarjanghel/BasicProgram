package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/write1.txt");
		int i;
		String s = "";
		do {
			i = fis.read();
			if (i != -1)
				s = s + (char) i;
		} while (i != -1);
		System.out.println(s);
	}

}
