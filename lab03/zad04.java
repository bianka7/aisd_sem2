package lab03;
import java.util.Scanner;

public class zad04 {
	private static class Node{
		String capital;
		Node next;
		
		Node(String nb){
			capital = nb;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String city;
		Node first = null;
		
		for(int i = 0; i<5; i++) {
			city = scanner.next();
			Node oldFirst = first;
			first = new Node(city);
			first.capital = city;
			first.next = oldFirst;
		}
		
		scanner.close();
		System.out.print("Stolice w liscie: ");
		for(Node x = first; x!=null; x=x.next) {
			System.out.print(x.capital + " ");
		}
		System.out.println();
		//Berlin Praga Bratyslawa Kijów Mińsk Wilno Moskwa
		
		//a) dodanie Moskwy i Wilna
		Node newFirst = new Node("Wilno");
		newFirst.next = first;
		first = newFirst;
		
		Node teraz = first;
		while(teraz.next != null) {
			teraz = teraz.next;
		}
		teraz.next = new Node("Moskwa");
		
		
		System.out.print("Dodanie pozostalych stolic: ");
		for(Node x = first; x!=null; x=x.next) {
			System.out.print(x.capital + " ");
		}
		System.out.println();
		
		//b) usunięcie stolizy z najmniejsza populacja Bratysława
        Node poprzedni = null;
        Node aktualny = first;
        
        while (aktualny != null) { //dopoki aktualny nie bedzie null
            if (aktualny.capital.equals("Bratysława")) { //jezeli aktualny wezel jest Bratyslawa
            	poprzedni.next = aktualny.next; // omija wezel z Bratyslawa
            }else { //jezeli nie jest rowny Bratyslawa
            	poprzedni = aktualny; //poprzedni wskazuje na obecny wezel, potrzebne kiedy aktualny wezel nie zostanie usuniety
            }
            aktualny = aktualny.next; //wszyskie wezly przesuwamy do nastepnego wezla
        }
        
		System.out.print("Usunięcie stolicy z najmniejszą populacją: ");
		for(Node x = first; x!=null; x=x.next) {
			System.out.print(x.capital + " ");
		}
	}
}
