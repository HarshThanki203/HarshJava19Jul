package PracticeWork;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * throw : It is a keyword.
 * 
 * 			It is not a block of code like try,catch.
 * 
 * 			throw keyword is used to throw the Exception Explicitly.
 * 
 * 
 * 	Rules for writing throw keyword.
 * 
 * 1) throw keyword will only be written in block.
 * 2) throw keyword is used with object of that particular class.
 * 3) Once you write throw keyword, after that you cannot write the code.
 * 
 * 
 * 
 */
public class ThrowDemo {
	
	public static void demo()
	{
		int a;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter A: ");
			a = sc.nextInt();
			if(a > 0)
			{
				System.out.println("Square of A : "+ (a*a));				
			}
			else {
				throw new Exception("Please Enter +ve Value");				
			}
				
		}
		catch(Exception e){
			System.out.println("Exception caught"+e);
			demo();
		}
	}
	
	
	public static void main(String[] args) {
		demo();
	}

}









