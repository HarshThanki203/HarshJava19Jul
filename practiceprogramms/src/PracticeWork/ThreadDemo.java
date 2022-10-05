package PracticeWork;

public class ThreadDemo {
	
	public static void main(String[] args)
	{
		Thread t = Thread.currentThread();
		t.setName("MyThread");
		System.out.println("After Name Change :"+t);
		t.setPriority(10);
		System.out.println("After Name Change :"+t);
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(t+" : "+i);
				
				Thread.sleep(1000);
			}
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Thread Existing");
	}
}