package practiceprogramms;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class FinaLInputOutPutS {

	public static void main(String[] args) throws Exception{
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


