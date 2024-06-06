package lab12;

public class zad01 {
//DODAJ DELETE
	private static int M = 5;
	//private static Integer[] st1 = new Integer[M];
	private static Node[] st2 = new Node[M];
	
	private static class Node{
		private Integer key;
		private Integer value;
		private Node next;
			public Node(Integer k, Integer v, Node n) {
			 key = k;
			 value = v;
			 next= n;
		 } 
	}
	
	private static int hash(Integer k) {
		return (11 * k % M);
	}
	
	public Integer get(Integer key) {
		int i = hash(key);
		for(Node x = st2[i]; x != null; x = x.next) {
			if(key.equals(x.key)) {
				return x.value;
			}
		}
		return null;
	}
	
	public static void put(Integer key, Integer value) {
		int i = hash(key);
		for(Node x = st2[i]; x != null; x = x.next) {
			if(key.equals(x.key)) {
				x.value = value;
				return;
			}
		}
		st2[i] = new Node(key, value, st2[i]);
	}
	
	static void print() {
		for(int i = 0; i < M; i++) {
			for(Node x = st2[i]; x != null; x = x.next) {
				System.out.print(x.value + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[] klucze = new int[] {69, 65, 83, 89, 81, 85, 84, 74, 79, 78};

		for(int i = 0; i < klucze.length; i++) {
			put(klucze[i], (klucze[i]*10));	
		}
		
		print();
	}
}