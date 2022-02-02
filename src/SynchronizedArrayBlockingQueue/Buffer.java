package SynchronizedArrayBlockingQueue;

public interface Buffer {
	// place int values into Buffer
	public void blockingPut(int value) throws InterruptedException;
	
	// return int value from Buffer
	public int blockingGet() throws InterruptedException;
}
