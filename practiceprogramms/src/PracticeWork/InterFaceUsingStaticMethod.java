package PracticeWork;

interface ifs3{
	void meth1();
}

interface ifs4 extends ifs3{
	
	static void meth2()
	{
		System.out.println("Meht2 Defined In InterFace...");
	}
}

class ABC1 implements ifs4 {
	
	public void meth() {
		System.out.println("Meth1 Defined In ABC1");
	}

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		
	}
}
class XYZ1 implements ifs4 {
	
	public void meth1() {
		System.out.println("Meth Defined In XYZ1");
	}
}

public class InterFaceUsingStaticMethod {
	
	public static void main(String[] args) {
		
		ABC1 a = new ABC1();
		a.meth1();
	}

}
