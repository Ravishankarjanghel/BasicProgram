package FileHandling;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) throws IOException {
		File f = new File("./data/PrintWriterExample.txt");
		PrintWriter p = new PrintWriter(f);
		p.println("Ravishankar");
		p.println("Shankar");
		p.println("Janghel");
		
		p.close();
		
		
		

	}

}
