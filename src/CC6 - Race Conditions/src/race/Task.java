package race;

public class Task implements Runnable{
	
	Counter c = null;
      
	
	public Task(Counter cntr)
	{
		this.c = cntr;
	}
	@Override
	public void run() {
		this.c.incrementCounter();
		System.out.println("value for " + Thread.currentThread().getName() + " - " + this.c.getCounter());
	}

}
