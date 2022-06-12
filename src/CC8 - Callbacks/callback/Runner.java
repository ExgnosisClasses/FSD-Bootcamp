package callback;

public class Runner {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyTask(new CallBack1()));
		Thread t2 = new Thread(new MyTask(new CallBack2()));
		t1.start();
		t2.start();
	}

}
