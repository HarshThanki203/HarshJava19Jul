package PracticeWork;
import java.util.Scanner;

public class StaticKeyword {
	
	static int a;
	
	void setvalue()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A :");
		a = sc.nextInt();
	}
	
	void printvalue()
	{
		System.out.println("A ="+a);
	}
	
	public static void main(String[] args)
	{
		StaticKeyword s1 = new StaticKeyword();
		StaticKeyword s2 = new StaticKeyword();
		StaticKeyword s3 = new StaticKeyword();
		
		s1.setvalue();
		s2.setvalue();
		s3.setvalue();
		s1.printvalue();
		s2.printvalue();
		s3.printvalue();
	}

}
