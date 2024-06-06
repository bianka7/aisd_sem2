package lab05;

public class KolejkaInt {
	private class Node{	
		int item;
		Node next;
	}
	
	private static Node first = null;
	private static Node last = null;
	private int N;
	
	KolejkaInt(){
		first = null;
		last = null;
		N = 0;
	}
	
	void Enqueue(int s) {
		Node oldLast = last;
		last = new Node();
		last.item = s;
		last.next = null;
		if(isEmpty()) {
			first = last;  //bez tego first == null
		}
		else {
			oldLast.next = last;
		}
		N++;
	}
	
	int Dequeue() {
		N--;
		int s = first.item;
		first = first.next;
		if(isEmpty()) {
			last = null;
		}
		return s;
	}
	
	
	int size() {
		return N;
	}
	
	boolean isEmpty() {	
		if(first == null) {
		return true;
		}
		else {
			return false;
		}
	}
	
	static void print() {
		for(Node y = first; y!=null; y=y.next) {
			System.out.print(y.item + " ");
		}
	}
	
}
