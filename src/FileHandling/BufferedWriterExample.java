package FileHandling;

import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterExample {

	public static void main(String[] args) throws IOException {
		Writer f = new FileWriter("./data/write1.txt",true);
		BufferedWriter bw = new BufferedWriter(f);
		
		bw.write("I am a good man.");
		bw.close();
	}

}
