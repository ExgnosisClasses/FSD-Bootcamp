package race;

public class Runner2 {
	public static void main(String[] args) {
		SyncCounter counter = new SyncCounter();
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(counter, "Thread " + i);
			t.start();

		}
	}

}
