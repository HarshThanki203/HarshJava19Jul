package practiceprogramms;

interface ifs3{
	void meth1();
}

interface ifs4 extends ifs3{
	
	static void meth5()
	{
		System.out.println("MEth2 Defined in Interface.");
	}
}

class ABC1 implements ifs4{

	@Override
	public void meth1() {
		System.out.println("Meth1 Defined in ABC1");
	}
	
}

class XYZ1 implements ifs4{

	
	public void meth1() {
		System.out.println("Meth1 Defined in XYZ1");		
	}
	
}


public class InterStatic {

	public static void main(String[] args) {
		
		ABC1 a = new ABC1();
		a.meth1();
		
		XYZ1 x = new XYZ1();
		x.meth1();
		
		ifs4.meth5();
		
		
	} 
	
}

