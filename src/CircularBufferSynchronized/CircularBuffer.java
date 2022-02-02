package CircularBufferSynchronized;

import SynchronizedArrayBlockingQueue.Buffer;

public class CircularBuffer implements Buffer
{
	 private final int[] buffer = {-1, -1, -1}; // shared buffer
	
	 private int occupiedCells = 0; // count number of buffers used
	 private int writeIndex = 0; // index of next element to write to
	 private int readIndex = 0; // index of next element to read
	
	// place value into buffer
	public synchronized void blockingPut(int value) throws InterruptedException
	{
		// wait until buffer has space available, then write value;
		// while no empty locations, place thread in blocked state
		while (occupiedCells == buffer.length)
		{
			System.out.printf("Buffer is full. Producer waits.%n");
			wait(); // wait until a buffer cell is free
		} // end while
		
		 buffer[writeIndex] = value; // set new buffer value
		
		// update circular write index
		writeIndex = (writeIndex + 1) % buffer.length;
		
		++occupiedCells; // one more buffer cell is full
		displayState("Producer writes " + value);
		notifyAll(); // notify threads waiting to read from buffer
	}
	
	// return value from buffer
	public synchronized int blockingGet() throws InterruptedException
	{
		// wait until buffer has data, then read value;
		// while no data to read, place thread in waiting state
		while (occupiedCells == 0)
		{
		System.out.printf("Buffer is empty. Consumer waits.%n");
		wait(); // wait until a buffer cell is filled
		} // end while
		
		int readValue = buffer[readIndex]; // read value from buffer
		
		// update circular read index
		readIndex = (readIndex + 1) % buffer.length;
		
		--occupiedCells; // one fewer buffer cells are occupied
		displayState("Consumer reads " + readValue);
		notifyAll(); // notify threads waiting to write to buffer
		
		return readValue;
	}
	
	// display current operation and buffer state
	public synchronized void displayState(String operation)
	{
		// output operation and number of occupied buffer cells
		System.out.printf("%s%s%d)%n%s", operation,
		" (buffer cells occupied: ", occupiedCells, "buffer cells: ");
		
		for (int value : buffer)
		System.out.printf(" %2d ", value); // output values in buffer
		
		System.out.printf("%n ");
		
		for (int i = 0; i < buffer.length; i++)
		System.out.print("---- ");
		
		System.out.printf("%n ");
		
		for (int i = 0; i < buffer.length; i++)
		{
		if (i == writeIndex && i == readIndex)
		System.out.print(" WR"); // both write and read index
		else if (i == writeIndex)
		System.out.print(" W "); // just write index
		else if (i == readIndex)
		System.out.print(" R "); // just read index
		else
		System.out.print(" "); // neither index
		}
		System.out.printf("%n%n");
	}
}
