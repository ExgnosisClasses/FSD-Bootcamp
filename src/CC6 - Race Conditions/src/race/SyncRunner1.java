package race;

public class SyncRunner1 {

	public static void main(String[] args) {
		Counter counterObject = new Counter();
		for (int i = 1; i <= 10 ; i++) {
			Thread t = new Thread (new SyncTask(counterObject));
			t.start();
		}


	}

}
