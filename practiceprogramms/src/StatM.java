package practiceprogramms;

public class StatM {

	static int a=10;
	static int b;
	
	static void meth(int x) {
		System.out.println("X ="+x);
		System.out.println("A ="+a);
		System.out.println("B ="+b);
	}
	{
		System.out.println("Block 1 Called ");
	}
	
	static {
		System.out.println("Static Block Initialized");
		b=a*4;
	}
	{
		System.out.println("Block 2 Called");
	}
	
	public static void main(String[] args) {
		StatM s1 =new StatM();
		meth(12);
	}
}

