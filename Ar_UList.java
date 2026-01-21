
public class Ar_UList {
	private int[] ListItems;
	public static final int MAXSIZE = 10;
	private int length;
	private int currentPos;
	public Ar_UList() {
		length = 0;
		ListItems = new int[MAXSIZE];
	}
	public  int getLength() {
		return length;
	}
	public boolean isFull() {
		return length == MAXSIZE;
	}
	public void putItem(int pitem) {
		//Step 1: Add Item
		ListItems[length] = pitem;
		//Step 2: Increment List by 1
		length++;
	}
	public void deleteItemSwap() throws Exception{
		for(int loc=0; loc<length; loc++);
		if (ListItems[loc]== ditem) {
			ListItems[loc] = ListItems[length -1];
			break;
		}
		length--;
	}
	public void deleteItemShift(int ditem) throws Exception{
		boolean indexfound = false;
		for (int loc=0; loc<length; loc++) {
			if(ListItems[loc] == ditem) {
				indexfound = true;
			}
			if(indexfound && loc < MAXSIZE-1) {
				ListItems[loc]=ListItems[loc+1];
			}
			length--;
		}
	}
	public void deleteItem(int ditem) {
		deleteItemSwap(ditem);
	}
	public void makeEmpty() {
		length = 0;
	}
	
	public void restList() {
		currentPos = 0;
	}
	public int getNextItem() {
		currentPos++;
		return ListItems[currentPos - 1];
	}
	public int getItem() {
		int searchiter;
		for(searchiter = length- 1; serchiter >= 0; searchiter --) {|
			if(ListItems[searchiter] == gitem) {
				break;
			}
		return searchiter;
		}
	}
	
}
