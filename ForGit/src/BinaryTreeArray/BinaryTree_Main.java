package BinaryTreeArray;

class BinaryTree {
	
	private int[] btree;
	public BinaryTree(int size,int[] array){
		int level,i;
		btree = new int[size];
		
		for(i=0;i<size;i++){
			btree[i] = -1;	//Initialize values of array.
		}
		
		btree[1] = array[1];	//Put the first value of array into the root.
								//Binary Tree's first value is not used.
		for(i=2;i<array.length;i++){	//Build the tree.
			level = 1;
			while(btree[level] != -1){	//When adding a new root,it need to compare to the first root repeatly.
				if(array[i] > btree[level]){
					level = level*2 + 1;
				}else{
					level = level*2;
				}
			}
			btree[level] = array[i];
		}
	}
	
	public void printBTree(){
		for(int i = 1 ;i < btree.length; i++){
			if(btree[i] != -1)
				System.out.print("["+i+":"+btree[i]+"]");
		}
		System.out.println();
	}
}
public class BinaryTree_Main {
	
	public static void main(String[] args) {
		int[] data = {0,5,6,4,8,2,3,7,1,9};
		
		BinaryTree bt = new BinaryTree(16,data);
		bt.printBTree();

	}

}
