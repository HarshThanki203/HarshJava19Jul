package practiceprogramms;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter : it is used to write in the file.
 * FileReader : it is used to read from the file.
 * 
 */

public class FileReadWrite {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("tops1.txt");
		String s = "This is FileWriterReader Demo";
		fw.write(s);
		fw.flush();
		fw.close();
		
		FileReader fr = new FileReader("tops1.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println("\nFile Read successfully");
		
	}

}

