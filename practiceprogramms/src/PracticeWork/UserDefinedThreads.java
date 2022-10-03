package PracticeWork;

class NewThread implements Runnable{
	
	Thread t;
	
	public NewThread() {
		t = new Thread(this,"child Thread");
		t.start();
	}
	

	public void run()
	{
		
		for(int i=0;i<=5;i++)
		{
			System.out.println(t+" : "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Child Thread Existing ");
	}
}

public class UserDefinedThreads {
	
	public static void main(String[] args) {
		
		new NewThread();
	}

}
