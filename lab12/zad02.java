package lab12;

public class zad02 {

	private static Integer M = 16;
	private static Integer[] vals = (Integer[]) new Integer[M];
	private static Integer[] keys = (Integer[]) new Integer[M];
	
	/*private static class Node{
		private Integer key;
		private Integer value;
		private Node next;
			public Node(Integer k, Integer v, Node n) {
			 key = k;
			 value = v;
			 next= n;
		 } 
	}*/
	
	private static int hash(Integer k) {
		return (11 * k % M);
	}
	
	public Integer get(Integer key) {
		for(int i = hash(key); keys[i] != null; i = (i+1)%M ) {  
			if(key.equals(keys[i])) {
				return vals[i];
			}
		}
		return null;
	}
	
	public static void put(Integer key, Integer value) {
		int i;
		for(i = hash(key); keys[i] != null; i = (i+1)%M) { 
//jezeli klucz jest juz zajety przechodzimy do nastepnego indeksu w tablicy, uzywa modulo zeby wrocic do poczatku tablicy jezeli dojdziemy do jej konca
			if(keys[i].equals(key)) {
				break;
			}
		}
		keys[i] = key;
		vals[i] = value;
	}
	
	static void print() {
		for(int i = 0; i < M; i++) {
			if(vals[i] == null) {
				System.out.print(". " );
			}
			else {
			System.out.print(vals[i] + " ");
			}
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