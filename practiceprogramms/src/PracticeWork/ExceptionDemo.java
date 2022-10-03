package PracticeWork;



import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Exception : It is an abnormal situation that arises during the Runtime of program is called Exception.
 * 
 * It will terminate the program there itself where the exception is raised.
 * 
 * e.g There are 20 lines of Code and the Exception is raised at 4th line , so it will  terminate at that point only, it
 *     will not go the next line.
 *     
 * 
 * There are 2 types of Exception.
 * 
 * 
 * 1) Checked Exception.
 * 2) Unchecked Exception.
 * 
 * Checked Exception : This kind of Exceptions are handle at Compile Time.
 * 
 * Unchecked Exception : This kind of Exceptions are handle at Run Time.
 * 
 * 
 * To handle Exceptions java provides you 5 keywords.
 * 
 * 
 * 1)try
 * 2)catch
 * 3)finally
 * 4)throw
 * 5)throws
 * 
 * 
 * try : try is block of code, it will never be alone
 *       it should compulsory have catch block or finally block.
 *       try block can have more than one catch block.
 *       
 *       e.g 
 *       
 *       	try{
 *       			//code
 *       	}
 *       	catch(Exception e)
 *       	{
 *       			//code
 *       	}	
 * 
 * finally : It will exceute at runtime always, evenm if there is no exception raised.
 * 
 */

public class ExceptionDemo {
	
	public static void main(String[] args) {
		System.out.println("Start Code");
		int a,b,c;
		Scanner sc= new Scanner(System.in);	
		try {
			System.out.println("Enter A : ");
			a= sc.nextInt();
			System.out.println("Enter B");
			b = sc.nextInt();
			c = a/b;
			System.out.println("Division : "+c);
			//int arr[] = {1,2,3};
			//System.out.println(arr[5]);
			
			System.out.println("End Code");
		}
		
		/*
		 * catch(ArithmeticException e) { System.out.println("Exception Caught"); }
		 * catch(InputMismatchException e) { System.out.println("Exception Caught"); }
		 * catch(ArrayIndexOutOfBoundsException e) {
		 * System.out.println("Exception Caught"); }
		 */
		 
		catch(Exception e)
		{
			System.out.println("Exception Caught");
		}
		finally
		{
			System.out.println("Finally block executed.");
		}
		
		
		}
	}


