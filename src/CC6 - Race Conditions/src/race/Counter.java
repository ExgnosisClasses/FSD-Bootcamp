package race;

public class Counter {
	int counter = 0;
	
	 public  void incrementCounter(){
		    try {
		      Thread.sleep(100);
		    } catch (InterruptedException e) {
		      System.err.println(e);
		    }
		    counter++;
		  }
		  public int getCounter(){
		    return counter;
		  }

}
