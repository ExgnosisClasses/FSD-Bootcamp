package semaphore;

import java.util.concurrent.Semaphore;

public class Resource extends Thread {

	static Semaphore semaphore = new Semaphore(4);

	String name = null;

	Resource(String n) {
		this.name = n;
	}

	@Override
	public void run() {
		try {

			System.out.println(this.name + " : acquiring lock...");
			System.out.println(
					this.name + " : available Semaphore permits now: " 
			                 + Resource.semaphore.availablePermits());

			Resource.semaphore.acquire();
			System.out.println(name + " : got the permit!");

			try {
				for (int i = 1; i <= 5; i++) {
					System.out.println(this.name + " : is performing operation " 
				            + i	+ ", available Semaphore permits : " 
							+ Resource.semaphore.availablePermits());
					Thread.sleep(1000);
				}
		
			} finally {
				System.out.println(this.name + " : releasing lock...");
				Resource.semaphore.release();
				System.out.println(
						this.name + " : available Semaphore permits now: " 
				                  + Resource.semaphore.availablePermits());

			}

		} catch (InterruptedException e) {

			System.out.println(e);

		}
	}
}