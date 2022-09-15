package practiceprogramms;

public class ThreadDemo {
	
	public static void main(String[] args)
	{
		Thread t =Thread.currentThread();
		t.setName("My Thread");
		System.out.println("After Name Change :"+t);
		t.setPriority(6);
		System.out.println("After Priority Change :"+t);
		try {
			for(int i=1; i<=5; i++) {
				System.out.println(t +" :"+ i);
				
				Thread.sleep(2000);
			}
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("Thread is Existing...");
	}
	
}









