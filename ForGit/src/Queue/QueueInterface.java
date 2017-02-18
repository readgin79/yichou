package Queue;

public interface QueueInterface {
	//Checking if this queue is empty.
	boolean isQueueEmpty();
	//To insert a object into this queue.
	boolean enqueue(int d);
	//To get next object from this queue.
	int dequeue();
}
