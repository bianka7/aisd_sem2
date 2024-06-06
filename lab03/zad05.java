package lab03;
import java.util.Random;

public class zad05 {
	private static class Node{
		int number;
		Node next;
		
		Node(int nb){
			number = nb;
		}
	}
	
	public static void main(String[] args) {
		Random random = new Random();
		int x;
		Node first = null;
		for(int i = 0; i<20; i++) {
			x = random.nextInt(990)+10; 
			Node oldFirst = first;
			first = new Node(x);
			first.number = x;
			first.next = oldFirst;
		}
		System.out.print("Lista 20 liczb losowych: ");
		for(Node y = first; y!=null; y=y.next) {
			System.out.print(y.number + " ");
		}
		System.out.println();
		//a) wstaw liczbe 1000 przed pierwsza liczba 3 cyfrowa
		
		Node teraz = first;
        Node poprzedni = null;
        
		while(teraz != null) { //przechodzimy przez kazdy wezel listy
			if(teraz.number>=100) { //jezeli aktualna liczba jest >= 100
				Node tysiac = new Node(1000); 
				tysiac.next = teraz; //next wezla tysiac wskazuje na obecny wezel i wstawia wezel tysiac przed nim
				if(poprzedni != null) { 
					poprzedni.next = tysiac; //poprzedni wezel musi wskazywac na nowy wezel i umiescic go przed obecnym wezlem
				}
				else {
					first = tysiac; //jezeli poprzedni == null to znaczy wstawiamy go na poczatek listy
				}
				break; //to oznacza ze 1000 zostalo wstawione
			}
			poprzedni = teraz; //przesuwamy wszyskie wezly 
			teraz = teraz.next; //o jedno miejsce do przodu
		}
        
		System.out.print("Liczba 1000 przed pierwsza liczba 3 cyfrowa: ");
		for(Node y = first; y!=null; y=y.next) {
			System.out.print(y.number + " ");
		}
		System.out.println();
		
		//b) usun pierwszy i ostatni element z listy
		first = first.next;
		teraz = first;
		poprzedni = null;

        while (teraz.next != null) {
        	poprzedni = teraz;
            teraz = teraz.next;
        }		
		
        poprzedni.next = null;
        
		System.out.print("Usunięcie pierwszego i ostatniego elementu: ");		
		for(Node y = first; y!=null; y=y.next) {
			System.out.print(y.number + " ");
		}
		
		
	}

}
