package PracticeWork;

class MyThread extends Thread {
	
	Thread t;
	
	public MyThread() {
		super("Child Thread");
		start();
	}
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(this+ " : "+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Child Thread Existing");
	}
}

public class ThreadClassDemo {
     
	public static void main(String[] args)
	{
		new MyThread();
	}
}
