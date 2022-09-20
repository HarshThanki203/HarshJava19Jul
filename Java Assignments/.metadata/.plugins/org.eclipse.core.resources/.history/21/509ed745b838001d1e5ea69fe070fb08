package practiceprogramms;
import java.util.Scanner;

public class Throws {

	public static void demo() throws Exception{
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A :");
		a = sc.nextInt();
		
		if(a>0) {
			System.out.println("Square of A :"+(a*a));	
		}
		else
		{
			throw new Exception("Please Enter +ve no. ");
			
		}
		
		
		
	}
	public static void main(String[] args) {
		try {
			demo();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
