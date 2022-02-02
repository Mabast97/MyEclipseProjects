package Collections;

import java.util.PriorityQueue;

public class PriorityQueueEx {
	public static void main(String args[])
	{
		PriorityQueue<Double> queue = new PriorityQueue<>();

		queue.offer(3.1);
		queue.offer(4.1);
		queue.offer(7.1);
		queue.offer(2.1);
		queue.offer(4.1);
		queue.offer(6.1);
		
		System.out.println("Polling from queue : ");
		while (queue.size() > 0)
		{
			System.out.println(queue.peek());
			queue.poll();
		}
		
	}

}
