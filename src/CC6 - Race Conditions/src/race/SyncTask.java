package race;

public class SyncTask implements Runnable {
	Counter c = null;
    
	
	public SyncTask(Counter cntr)
	{
		this.c = cntr;
	}
	@Override
	public void run() {
		synchronized(c){
		this.c.incrementCounter();
		System.out.println("value for " + Thread.currentThread().getName() + " - " + this.c.getCounter());
		}
		
	}

}

