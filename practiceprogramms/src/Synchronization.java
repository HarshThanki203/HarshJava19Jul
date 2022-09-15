package practiceprogramms;

class Caller{
	
	public void call(String msg)
	{
		System.out.print("["+msg);
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("]");	
	}
	
}

class Callback implements Runnable{

	Thread t;
	String msg;
	Caller c;
		
	public Callback(String msg, Caller c) {
		
		this.msg = msg;
		this.c = c;
		t = new Thread(this);
		t.start();
	}


	public void run() {
			synchronized(c) {
				c.call(msg);	
			}
		
	}
	
}


public class Synchronization {

	public static void main(String[] args) {
		
		Caller c = new Caller();
		Callback c1 = new Callback("Hello",c);
		Callback c2 = new Callback("World",c);
		Callback c3 = new Callback("Synchronized",c);
	}
}
