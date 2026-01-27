package SList;

public class Ar_SList {
	public static final int MAXSIZE = 10;
	private int[] ListItems;
	private int length;
	private int currentPos = 0;
	
	public Ar_Slist() {
		length = 0;//List is initially empty
		ListItems = new int[MAXSIZE];
		
	}
	
	public void putItem(int pitem) {
		int aloc =0;
		boolean moreToSearch = aloc < length;
		while(moreToSearch) {
			if(pitem < ListItems[aloc]) {
				moreToSearch = false;
			}
			else {
				aloc++;
				moreToSearch = aloc < length;
			}
		}
		for (int i=length; i> aloc; i--) {
			ListItems[i] = ListItems[i-1];
			ListItems[aloc] = pitem;
			length++;
		}
	}
	
	public void dItem(int ditem) {
		int aloc = 0;
		boolean moreToSearch = true;
		while(moreToSearch && aloc < length) {
			if (ditem == ListItems[aloc]) {
				moreToSearch = false;
			}
			else {
				aloc++;
			}
		}
			for(int i = aloc; i < length; i++) {
				if(i < MAXSIZE-1) {
					ListItems[i] = ListItems[i+1];
				length--;
				}
			}
		}
	public int getItem(int gitem) {
		int midpoint = 0, first = 0, last = length-1;
		boolean moreToSearch = first <= last;
		while(moreToSearch) {
			midpoint = (first + last)/2;
			if(gitem == ListItems[midpoint]) {
				return midpoint;
			}
			else if(gitem < ListItems[midpoint]) {
				last = midpoint - 1;
			}
			else {
				first = midpoint + 1;
			moreToSearch =  first <= last;
			}
		}
	}
	
	public void makeEmpty() {
		length = 0;
	}
	
	boolean isFull() {
		return length == MAXSIZE;
	}
	
	public void resetList() {
		currentPos = 0;
	}
	
	public int getNextItem() {
		currentPos++;
		return ListItems[currentPos-1];
	}
	public void printList() {
		System.out.print("(");
		for(int loc=0; loc<length; loc++) {
			if(loc<length-1) {
				System.out.print(", ");
			}
		System.out.println(")");
		}
	}
	
	public int getLength() {
		return length;
	}
}
