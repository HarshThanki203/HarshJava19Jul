package practiceprogramms;
import java.util.Scanner;

class A{
	
	int a;
	Scanner sc = new Scanner(System.in);
	
	void getA()
	{
		System.out.println("Enter A : ");
		a = sc.nextInt();
	}
	
	void showA()
	{
		System.out.println("A = "+a);
	}
	
}

class B extends A{
	int b;
	Scanner sc = new Scanner(System.in);
	
	void getB()
	{
		System.out.println("Enter B : ");
		b = sc.nextInt();
	}
	
	void showB()
	{
		System.out.println("B = "+b);
	}
}

public class Singleinheritance {

	public static void main(String[] args) {
		
		B b = new B();
		b.getA();
		b.getB();
		b.showA();
		b.showB();
		
	}
	
	}


