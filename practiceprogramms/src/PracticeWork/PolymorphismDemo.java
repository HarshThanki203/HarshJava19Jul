package PracticeWork;

class MethodOverLoadingDemo {
	
	int add(int a, int b)
	{
		return a+b;
	}
	float add(float a1,float b1)
	{
		return a1+b1;
	}
	int add(int a, int b, int c)
	{
		return a+b+c;
	}
}

public class PolymorphismDemo {
	
	public static void main(String[] args)
	{
		MethodOverLoadingDemo mo = new MethodOverLoadingDemo();
		System.out.println("Addition ="+mo.add(54,74));
		System.out.println("Addition ="+mo.add(5.6f, 74.5f));
		System.out.println("Addition ="+mo.add(5,4));
	}

}
