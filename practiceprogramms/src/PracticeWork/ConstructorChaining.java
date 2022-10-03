package PracticeWork;

class A2{
	
	A2(){
	
	System.out.println("A2''s Constructor Called...");
}
	void show()
	{
		System.out.println("Show From A ");
	}
}
class B2 extends A2 {
	
	B2()
	{
		System.out.println("B2's Constructor Called ");
	}
	void show()
	{
		super.show();
		System.out.println("Show From B");
	}
}
class C2 extends B2{
	
	C2(){
		System.out.println("C2's Constructor Called");
	}
	void show()
	{
		super.show();
		System.out.println("Show From C");
	}
}

public class ConstructorChaining {
	    
	    public static void main(String[] args )
	    {
	    	C2 c = new C2();
	    	c.show();              
	    }

}
