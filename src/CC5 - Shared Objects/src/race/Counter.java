package race;

class Counter implements Runnable {
	private int myCount = 0;

	public void increment() {
		try {
			Thread.sleep(10);
		} catch (Exception e) {
			System.err.println(e);
		}
		this.myCount++;
	}

	public void decrement() {
		this.myCount--;
	}

	public int getValue() {
		return this.myCount;
	}

	@Override
	public void run() {
		this.increment();
		System.out.println(
				"Value for Thread After increment " + Thread.currentThread().getName() + " " + this.getValue());
		this.decrement();
		System.out.println("Final value for Thread " + Thread.currentThread().getName() + " " + this.getValue());

	}
}