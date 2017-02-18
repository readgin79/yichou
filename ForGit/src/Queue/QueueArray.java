package Queue;

//This class is for practicing data-structure Queue.
public class QueueArray implements QueueInterface{
	private int[] queue;
	private int front;
	private int rear;
	
	public QueueArray(int size){
		queue = new int[size];
		front = -1;
		rear = -1;
	}
	
	@Override
	public boolean isQueueEmpty() {
		if(front == rear) return true;
		else return false;
	}

	@Override
	public boolean enqueue(int d) {
		if(rear >= queue.length){
			return false;
		}else{
			queue[++rear] = d;
			return true;
		}
	}

	@Override
	public int dequeue() {
		if(this.isQueueEmpty()){
			return -1;
		}else{
			return queue[++front];
		}
	}
	
	public static void main(String[] args) {
		int []data = {1,2,3,4,5,6};
		QueueArray q = new QueueArray(10);
		int i;
		System.out.print("The array will be put into queue:");
		for(i=0;i<6;i++){
			q.enqueue(data[i]);
			System.out.print("["+data[i]+"]");
		}
		System.out.print("\nThe order to take out from queue:");
		while(!q.isQueueEmpty()){
			System.out.print("["+q.dequeue()+"]");
		}
		System.out.println();
	}

}
