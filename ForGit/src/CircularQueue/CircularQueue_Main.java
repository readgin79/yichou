package CircularQueue;

public class CircularQueue_Main {
	private int[] queue;
	private int front;
	private int rear;
	
	public CircularQueue_Main(int size){
		queue = new int[size];
		front = -1;
		rear = -1;
	}

	public boolean isCQueueEmpty(){
		if(front == rear){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isCQueueFull(){
		int pos;
		pos = (rear+1) % queue.length;
		if(front == pos){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean enqueue(int d){
		if(isCQueueFull()){
			return false;
		}else{
			rear = (rear+1) % queue.length;
			queue[rear] = d;
		}
		return true;
	}
	
	public int dequeue(){
		if(isCQueueEmpty()){
			return -1;
		}else{
			front = (front+1) % queue.length;
			return queue[front];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
