package practiceprogramms;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Throw {
	
	public static void demo() {
		int a;
		Scanner sc = new Scanner(System.in);
	     
		try {
			System.out.println("Enter A :");
			a = sc.nextInt();
			
			if (a>0) {
				System.out.println("Square of A :" +(a*a));
			}
			else {
		       throw new Exception("Please Enter +ve value");		
			}
		
	
	}
		catch(Exception e) {
			System.out.println("Exception Caught"+e);
			demo();
		}

}
	
public static void main(String[] args) {
	demo();
}
}