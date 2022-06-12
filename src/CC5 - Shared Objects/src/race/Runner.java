package race;

public class Runner {
	public static void main(String[] args) {
		Counter counter = new Counter();
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(counter, "Thread " + i);
			t.start();

		}
	}
}
