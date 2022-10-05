package PracticeWork;

class MyThread extends Thread
{
	Thread t;
	
	public MyThread()
	{
		super("Child Thread");
		start();
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(this+" : "+t);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Thread Class Existing....");
	}
}

public class ThreadClassDemo {
	
	public static void main(String[] args)
	{
		new MyThread();
	}
}