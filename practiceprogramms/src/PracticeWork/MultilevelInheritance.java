package PracticeWork;
import java.util.Scanner;

class A1{

	int a;
	Scanner sc = new Scanner(System.in);
	void getA()
	{
		System.out.println("Enter A :");
		a=sc.nextInt();
	}
	void showA()
	{
		System.out.println("A ="+a);;
	}
	
}
class B1 extends A1 {
	
	int b;
	Scanner sc = new Scanner(System.in);
	
	void getB()
	{
		System.out.println("Enter B :");
		b = sc.nextInt();
	}
	void showB()
	{
		System.out.println("B ="+b);
	}
	
}

class C1 extends B1 {
	
	int c;
	
	Scanner sc = new Scanner(System.in);
	
	void getc()
	{
		System.out.println("Enter C :");
		c = sc.nextInt();
	}
	void showC() {
		System.out.println("C ="+c);
	}
}

public class MultilevelInheritance {
	
	public static void main(String[] args)
	{
		C1 c = new C1();
		c.getA();
		c.getB();
		c.getc();
		c.showA();
		c.showB();
		c.showC();
		
	}

}








