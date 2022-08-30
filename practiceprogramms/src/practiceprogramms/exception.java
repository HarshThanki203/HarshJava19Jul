package practiceprogramms;
import java.util.Scanner;

public class exception {

	public static void main(String[] args) {
		
		System.out.println("start code");
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		try {
			System.out.println("Enter A :");
			a=sc.nextInt();
			System.out.println("Enter B :");
			b=sc.nextInt();
			System.out.println("Division :"+b);
			int arr[] = {1,2,3};
			System.out.println(arr[5]);
			
			System.out.println("End Code");
	}

		catch(Exception e) {
			
			System.out.println("Exception Caugth");
		}
}
}