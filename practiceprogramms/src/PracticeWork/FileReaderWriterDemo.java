package PracticeWork;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("Tops1.txt");
		String s = "This is FileWriteReader Demo ";
		fw.write(s);
		fw.flush();
		fw.close();
		
		FileReader fr = new FileReader("Tops1.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.println((char)i);
		}
		System.out.println("\nFile Read Successfully");
		
	}

}
