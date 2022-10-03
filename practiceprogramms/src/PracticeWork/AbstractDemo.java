package PracticeWork;



/*
 * Abstraction : It other words it means hiding. It can be of 2 types i) Partial Abstraction (Half hiding)
 * 																	  ii) Complete Abstraction (Full Hiding)
 * 
 * Partial Abstraction can be achieved by using Abstract class.
 * Complete Abstraction can be achieved by using interface.
 * 
 * -> Abstraction is Hiding the internal features and giving, some other feature to access that feature.
 * 
 * e.g Fan,Air			
 * 	
 * 
 * Abstract Class:
 * 
 * 
 * 1) Abstract class contains abstract method and non-abstract methods. i.e (concrete and non- concrete methods)
 * 
 * 
 * 2) Abstract Methods do not contain a body.
 * 
 * 3) We cannot create object of Abstract class.
 * 
 * 4) Abstract methods are just declaration, they do not have a body.
 * 
 * 5) It provides partial Abstraction.
 * 
 * 6) When you inherit the abstract class, it is 100% compulsory to implement abstract methods in the class which you are 
 *    inheriting.
 * 
 * 
 */


abstract class abs1 {
	
	abstract void meth1();   // Abstract Methods
	
	void meth2()     //Non- Abstract Methods.
	{
		System.out.println("Non-Abstract Method from ABS1");
	}
}

class abs2 extends abs1{	
	
	
	void meth3()
	{
		System.out.println("Non- Abstract Method from ABS2");
	}

	
	void meth1() {		
		System.out.println("Abstract Method Implemented in Non-Abstract Class");
		
	}
}
		


public class AbstractDemo {
	public static void main(String[] args) {
		
		abs2 a = new abs2();
		a.meth1();
		a.meth2();
		a.meth3();
	
	}
}
