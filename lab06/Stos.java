package lab06;

public class Stos<Item>{
	private class Node{	
		Item item;
		Node next;
	}
	
	private Node first = null;
	private int N;
	
	Stos(){
		first = null;
		N = 0;
	}

	void push(Item item) {
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
		
		N++;
	}
	
	Item pop() {
		N--;
		Item s = first.item;
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
	
	void print() {
		for(Node y = first; y!=null; y=y.next) {
			System.out.print(y.item + " ");
		}
	}
}
