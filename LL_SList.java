

public class UL_SList {
	private class DLNode
	{
		public int item;
	    public DLNode next;
	    public DLNode prev;

	    //--------------------------------------------------------------
	    //  Sets up the node
	    //--------------------------------------------------------------
	    public DLNode(int newitem)
	    {
	    	item = newitem;
	    	next = null;
	    	prev = null;
	    }
	}
	private DLNode ListEnd;
	private DLNode currentPos;	
	
	public LL_SList() {
		ListEnd = new DLNode (Integer.MAX_VALUE);
		ListEnd.next = ListEnd;
		ListEnd.prev = ListEnd;
	}
	
	
	boolean isFull()  {
		return false; //Assume the size of a linked-list based implementation is UNBOUNDED for simplicity		
	}
	
	boolean isEmpty() {
		return ListEnd.next == ListEnd;
	}
	
	int getLength() {
		if (isEmpty())
			return 0;
		else {
		DLNode iterPos = ListEnd.next;
		int length=0;
		while (iterPos != ListEnd) {
			iterPos = iterPos.next;
			length++;
		 }
		}
		return length;
	}
	
	int getItem(int gitem) {
		int [] position = {0};
		findItemNode(gitem, position);
		return position;

	}
	
	private DLNode findItemNode(int fitem, int[] position) {
		position[0] = 0;
		DLNode nodeIter = ListEnd.next;
		while((nodeIter != ListEnd) && nodeIter.item < fitem){
			nodeIter = nodeIter.next;
			position[0] ++;
		}
		if(nodeIter.item != fitem) {
			position[0] = -1;
		}
		return nodeIter;
	}
	
	void makeEmpty() {
		ListEnd = null; //Garbage collector will take care of the rest!
	}
	
	
	void putItem(int pitem) {
		DLNode newNode = new DLNode(pitem);
		DLNode nodeCur = findItemNode(pitem, int[1]);
		}    
	}
	
	void deleteItem(int ditem) throws Exception { //Find the item in question, and "unlink" it		
		int testarr[] = new int[1];
		DLNode curNode = findItemNode(ditem, testarr);
		if (testarr[0] == -1) {
			throw new Exception("Item not in list.");
		curNode.next.prev = curNode.prev;
		curNode.prev.next = curNode.next;
	}
	
	void resetList() {
		currentPos = ListEnd;
	}

	
	int getNextItem() throws Exception {
		if (currentPos == null)
			throw new Exception("End of list has been reached.");
		int retItem = currentPos.item;
		currentPos = currentPos.next;
		return retItem;
	}

	void printList() { //simple function to print a list's items in stored order
		DLNode iterPos = ListEnd.next;
		System.out.print("(");
		while (iterPos != ListEnd) {
			System.out.print(iterPos.item);
			if (iterPos.next != ListEnd)
				System.out.print(", ");
			iterPos = iterPos.next;
		}				
		System.out.println(")");
	}
}
