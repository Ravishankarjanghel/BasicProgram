package FileHandling;


import java.io.FileOutputStream;
import java.io.IOException;

public class WriteAgainInFile {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("./data/write1.txt",true);
		char[] ch = "Ravi".toCharArray();
		
		for(char i:ch) {
			fos.write(i);
		}
		fos.close();
	}

}
