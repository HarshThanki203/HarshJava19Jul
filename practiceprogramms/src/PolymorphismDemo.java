package practiceprogramms;

class MethodOverloadingDemo{
	
	int add(int a, int b) {
		return a+b;
	}
	
	float add(float a1, float b1) {
		return a1+b1;
	}
	
	int add(int a, int b, int c) {
		return a+b+c;
	}
}

public class PolymorphismDemo {

	public static void main(String[] args) {
		
		MethodOverloadingDemo mo = new MethodOverloadingDemo();
		
		System.out.println("Addition ="+mo.add(70,44));
		System.out.println("Addition ="+mo.add(13.6f, 10.8f));
        System.out.println("Addition ="+mo.add(12, 13));
	}

}
