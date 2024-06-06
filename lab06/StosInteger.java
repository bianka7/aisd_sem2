package lab06;

public class StosInteger {
	private class Node{	
		Integer item;
		Node next;
	}
	
	private static Node first = null;
	private int N;
	
	StosInteger(){
		first = null;
		N = 0;
	}

	void push(Integer item) {
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
		
		N++;
	}
	
	Integer pop() {
		N--;
		int s = first.item;
		first = first.next;
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
