package semaphore;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Total available Semaphore permits : " 
				+ Resource.semaphore.availablePermits());
	
		Resource t1 = new Resource("Alpha");
		t1.start();
		Resource t2 = new Resource("Beta");
		t2.start();
		Resource t3 = new Resource("Gamma");
		t3.start();
		Resource t4 = new Resource("Delta");
		t4.start();
		Resource t5 = new Resource("Epsilon");
		t5.start();

		

	}

}
