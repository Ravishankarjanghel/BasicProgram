package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {

	public static void main(String[] args) throws IOException {
		FileReader f = new FileReader("./data/PrintWriterExample.txt");
		
		//reading lines from the file which I have created in buffer writer class.
		
		BufferedReader br = new BufferedReader(f);
		String s;
		String total = "";
		do {
			s = br.readLine();
			if (s != null) {
				total = total + s + " ";
			}
		} while (s != null);
		System.out.println(total);
	}

}
