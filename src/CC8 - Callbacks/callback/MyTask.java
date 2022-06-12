package callback;

public class MyTask extends Thread {
	private MyCallback c = null;
	boolean somethingHappened = false;
	
	public MyTask(MyCallback event) {
		this.c = event;
		this.somethingHappened = false;
		
	}
    @Override
	public void run() {
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			System.err.println(e);
		}
    	this.somethingHappened = true;
		if (this.somethingHappened) {
			this.c.callback();
		}
	}
}

class CallBack1 implements MyCallback {

	@Override
	public void callback() {
		System.out.println("Callback One");
		
	}
	
}

class CallBack2 implements MyCallback {

	@Override
	public void callback() {
		System.out.println("Callback Two");
		
	}
	
}