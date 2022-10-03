package PracticeWork;


//final class final1{
	 class final1{
	
	final int a = 100;
	
	final void show()
	{
		
		System.out.println("A = "+a);
	}
}

class final2 extends final1{
	
//	void show()
//	{
//	
//	}
}


public class FinalKeyword {

	public static void main(String[] args) {
		final2 f1 = new final2();
		f1.show();
	}
}





