package lab05;

public class KolejkaString {
		private class Node{	
			String item;
			Node next;
		}
		
		private static Node first = null;
		private static Node last = null;
		private int N;
		
		KolejkaString(){
			first = null;
			last = null;
			N = 0;
		}
		
		void Enqueue(String s) {
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

		String Dequeue() {
			N--;
			String s = first.item;
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
		static void ileKobiet() {
			int k = 0;
			for(Node y = first; y!= null; y=y.next) {
				String name = y.item;
				char ostatnia = name.charAt(name.length()-1);
				
				if(ostatnia == 'a') {
					k++;
				}
			}
			System.out.println("Ilość kobiet: " + k);
		}
		
		static void printFirst() {
			System.out.println("Pierwsza: " + first.item);
			System.out.print("Ostatni: " + last.item);
		}
}
