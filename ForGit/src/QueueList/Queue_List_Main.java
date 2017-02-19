package QueueList;

import Queue.QueueInterface;

class Node{
	int data;  //The data store in this node.
	Node next;  //The node which is directed to the next node.
	
	public Node(int data){
		this.data = data;
		next = null;
	}
}

class Queue_List implements QueueInterface{
	private Node front;  //The first node of this list.
	private Node rear;	 //The last node of this list.
	
	public Queue_List(){
		front = null;	rear = null;	//The initial empty list.
	}
	
	@Override
	public boolean isQueueEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean enqueue(int d) {
		Node new_node = new Node(d);
		if(rear == null){	//To speculate if the list is empty.
			front = new_node;	//If this list is empty,put the new node to the first loction.
		}else{
			rear.next = new_node;	//If this list is not empty,put this new node to the rear's next.
		}
		rear = new_node;
		return true;
	}

	@Override
	public int dequeue() {
		int d;
		if(!isQueueEmpty()){	//To speculate if the list is empty.
			if(rear == front){	//The last node in this list.
				rear = null;
			}
			d = front.data;
			front = front.next;
			return d;
		}else{
			return -1;
		}
	}
	
}

public class Queue_List_Main {

	public static void main(String[] args) {
		

	}

}
