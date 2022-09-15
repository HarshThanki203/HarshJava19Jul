package practiceprogramms;


class NewThread implements Runnable{
	
	Thread t;
	
	public NewThread() {
		t =new Thread(this,"Child Thread");
		t.start();
	}
	@Override
	public void run() {
		
		for(int i=0; i<5; i++) {
			System.out.println(t+" : "+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Child Thread Exiting...");
	}
public class UserDefinedThreads {
      
	public void main(String[] args) {
		new NewThread();
	}
}
}
