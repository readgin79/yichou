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
		CircularQueue_Main queue = new CircularQueue_Main(10);
		int[] array = new int[10];
		for(int i = 0; i<array.length-5;i++){
			queue.enqueue(i);
		}
		for(int i = 0; i<array.length;i++){
			System.out.print(queue.dequeue() + "  ");
		}
	}

}
