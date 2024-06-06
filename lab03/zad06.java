package lab03;

public class zad06 {
	private static class Node{
		int number;
		Node next;
		Node prev;
		
		Node(int nb){
			number = nb;
			prev = null;
			next = null;
		}
	}
	public static void main(String[] args) {
		Node head = null;
		Node tail = null;
		
		int pierwszeFound = 0;
		int i = 2;
		while(pierwszeFound < 12) {
			boolean pierwsza = true;
			for(int j = 2; j <= Math.sqrt(i); j++ ) {
				if (i % j == 0) {
			 		 pierwsza = false;
			 		 break;
				}		
			}
			if(pierwsza) {
				Node temp = new Node(i);
				if(head == null) {
					head = temp;
					tail = temp;
				}
				else {
					temp.next = head;
					head.prev = temp;
					head = temp;
				}
				pierwszeFound++;
			}
			i++;
		}
		for(Node y = tail; y!=null; y=y.prev) {
			System.out.print(y.number + " ");
		}
		System.out.println();
		
		// a) dodaj liczbe 1 na poczatek i kolejna liczbe pierwsza na koniec
	    Node temp = new Node(1); 
	    
	    tail.next = temp; 
	    temp.prev = tail; 
	    tail = temp; 
	  
	    Node temp2 = new Node(41);
	    temp2.next = head;
		head.prev = temp2;
		head = temp2; 
		
		System.out.print("Dodanie liczby 1 na początek i 41 na koniec: ");
		for(Node y = tail; y!=null; y=y.prev) {
			System.out.print(y.number + " ");
		}
		System.out.println();
		
		//b) zwróc rozmiar listy
		int rozmiar = 0;
		Node temp3 = head;
		while(temp3 != null) {
			rozmiar++;
			temp3 = temp3.next;
		}
		System.out.print("Rozmiar listy: " + rozmiar);
		System.out.println();
		
		//c) wskaz poprzednika i nastepnika liczby 23
		Node temp4 = head;
		while(temp4 != null) {
			if(temp4.number == 23) {
				Node poprzednik = temp4.next;
				Node nastepnik = temp4.prev;
				System.out.println("Poprzednik 23: " + poprzednik.number);
				System.out.println("Nastepnik 23: " + nastepnik.number);
				break;
			}
			temp4 = temp4.next;
		}
		
		//d)usun z listy najwieksza liczbe jednocyfrowa
		Node temp5 = head;
		int max = 0;
		Node maxNode = null;

		while (temp5 != null) {
	        if (temp5.number < 10 && temp5.number > max) {
	            max = temp5.number;
	            maxNode = temp5;
	        }
	        temp5 = temp5.next;
	    }

		System.out.print("Usunięcie największej liczby jednocyfrowej: ");
		for(Node y = tail; y!=null; y=y.prev) {
			if(y != maxNode) {
			System.out.print(y.number + " ");
			}
		}
	}
}