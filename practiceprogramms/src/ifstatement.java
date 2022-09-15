package practiceprogramms;

import java.util.Scanner;

public class ifstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter no...");
		int a = sc.nextInt();
		
		if(a>0)
		{
			System.out.println("A is +ve");
		}
		else {
			System.out.println("A is -ve");
		}
		
		
	}

}
