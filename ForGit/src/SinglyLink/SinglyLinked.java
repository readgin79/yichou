package SinglyLink;

public class SinglyLinked extends List{

	public SinglyLinked(int[] array){
		Node newnode;
		first = null;
		for(int i=0;i<array.length;i++){
			newnode = new Node(array[i]);
			newnode.next = first;
			first = newnode;
		}
	}
	
	@Override
	public boolean isListEmpty() {
		if(first==null) return true;
		else return false;
	}

	@Override
	public void printList() {
		Node current = first;
		while(current!=null){
			System.out.print("[" + current.data + "]");
			current = current.next;
		}
		System.out.println();
	}
	
	public Node searchNode(int d){
		Node current = first;
		while(current != null){
			if(current.data == d)
				return current;
			current = current.next;
		}
		return null;
	}

}
