package practiceprogramms;

interface ifs1{
	
	void meth1();
}
interface ifs2 extends ifs1{
	void meth2();
}

class ABC implements ifs1,ifs2{
	
	public void meth2() {
		System.out.println("Meth2 Defined in ABC");
	}
	
	public void meth1() {
		System.out.println("Meth1 Defined in ABC ");
		
	}
}

class XYZ implements ifs2{

	@Override
	public void meth1() {
		System.out.println("Meth1 Defined in XYZ");
		
	}

	@Override
	public void meth2() {
		System.out.println("Meth2 Defined in XYZ");
		
	}
	
}


public class Interface {

	public static void main(String[] args) {
		
		ABC a = new ABC();
		a.meth1();
		a.meth2();
		
		XYZ x = new XYZ();
		x.meth1();
		x.meth2();
		
	}
	
	
	
}

