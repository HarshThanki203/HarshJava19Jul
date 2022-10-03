package PracticeWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * FileOutputStream : It is use to write into the file.
 * FileInputStream :  It is use to read from the file.
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class FileInputOutPutStream {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("t1.txt");
		String s = "This is FileInputOutputStreamDemo";
		byte[] b = s.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		
		FileInputStream fis = new FileInputStream("t1.txt");
		int i;
		while((i = fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		fis.close();
		
}
}
