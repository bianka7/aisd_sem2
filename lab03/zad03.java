package lab03;


public class zad03 {
	private static class Node{
		int nrAlbumu; 
		String nazwisko; 
		String imie;
		Node next;
		
		Node(int nA, String nz, String im){
			nrAlbumu = nA;
			nazwisko = nz;
			imie = im;
		}
	}

	public static void main(String[] args) {
		
		Node first = new Node(213231, "nazwisko1", "imie1");
		
		Node s1 = new Node(213773, "krysiak", "bianka");
		first.next = s1;
		Node s2 = new Node(384329, "nazwisko2", "imie2");
		s1.next = s2;
 			
		for(Node x = first; x!=null; x=x.next) {
			System.out.print(x.nazwisko + " ");	
			System.out.print(x.imie + " ");	
			System.out.print(x.nrAlbumu + " ");
			System.out.println();
		}
		System.out.println();
		
		Node x = first;
		int y = x.nrAlbumu;
		String z = x.nazwisko;
		String i = x.imie;
		for(x = first; x!=null; x = x.next) {
			if(x.nrAlbumu < y ) {
				y = x.nrAlbumu;
				z = x.nazwisko;
				i = x.imie;
			}
		}
		
		System.out.println("Najmniejszy indeks: " + y);
		System.out.print("Dane studenta o najmniejszym indeksie: " + y+" "+ z +" "+ i);
	}
}
	