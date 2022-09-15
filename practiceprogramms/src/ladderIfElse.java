package practiceprogramms;

import java.util.Scanner;
public class ladderIfElse {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll No....");
		int rollno = sc.nextInt();
		System.out.println("Enter Name...");
		String name = sc.next();
		System.out.println("Enter Physics Marks...");
		int p = sc.nextInt();
		System.out.println("Enter Chemistry Marks...");
		int c = sc.nextInt();
		System.out.println("Enter Maths Marks...");
		int m = sc.nextInt();
		int tot = p+c+m;
		float per= (float)tot/3;
		System.out.println("Roll No :" +rollno);
		System.out.println("Name  :" +name);
		System.out.println("Total :" +tot);
		System.out.println("Percentage :" +per);
		
		
		if (per>75)
		{
			System.out.println("You pass at Distinction level");
			
		}
		else if  (per>60)
		{
			System.out.println(" First Class ");
			
		}
		else if (per > 40) {
			System.out.println("Second Class");
		}
		else {
			
			System.out.println("Fail");
			
		}
		
	}

}
