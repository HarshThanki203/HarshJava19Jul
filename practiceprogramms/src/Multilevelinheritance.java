package practiceprogramms;
import java.util.Scanner;

class Ad{
	int a;
	Scanner sc = new Scanner(System.in);
	void getad() {
		System.out.println("Enter A :");
		a = sc.nextInt();
	}
	void showad() {
		System.out.println("A :"+a);
		
	}
}

class B1 extends Ad{
	int b;
	
	Scanner sc = new Scanner(System.in);
	
	void getB() {
		
		System.out.println("Enter B :");
		b = sc.nextInt();
	}
	void showB2() {
		
		System.out.println("B ="+b);
	}
}

class C1 extends B1{
	
	int c;
	
	Scanner sc = new Scanner(System.in);
	
	void getC() {
		
		System.out.println("Enter c :");
		c = sc.nextInt();
	}
	
	void showC() {
		
		System.out.println("c ="+c);
	}
}


public class Multilevelinheritance {
	
	public static void main(String[] args ) {
		
		C1 c = new C1();
		c.getad();
		c.getB();
		c.getC();
	    c.showad();
	    c.showB2();
	    c.showC();
		
	}
}






