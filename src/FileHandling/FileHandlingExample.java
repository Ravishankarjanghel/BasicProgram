package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandlingExample {

	public static void main(String[] args) throws IOException  {
		File f = new File("./data/File1.txt");
		System.out.println("Created : "+f.createNewFile());
		System.out.println("Is Exist : "+f.exists());
		System.out.println("File name : "+ f.getName());
		System.out.println("File size : "+f.length());
		System.out.println("Absolute Path : "+f.getAbsolutePath());
		System.out.println("Conial path : "+f.getCanonicalPath());
		System.out.println(""+f.getPath());
	}

}
