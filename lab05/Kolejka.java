package lab05;

public class Kolejka<v> {
	private class Node{	
		v item;
		Node next;
	}
	
	Node first = null;
	private  Node last = null;
	private int N;
	
	Kolejka(){
		first = null;
		last = null;
		N = 0;
	}
	
	void Enqueue(v s) {
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
	
	v Dequeue() {
		N--;
		v s = first.item;
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
	
	void print() {
		for(Node y = first; y!=null; y=y.next) {
			System.out.print(y.item + " ");
		}
	}
	
	void printCzasy() {
        Node current = first;
        Node next = current.next;

        while (next != null) {
            Samochod terazAuto = (Samochod) current.item;
            Samochod kolejneAuto = (Samochod) next.item;

            String[] terazGodz = terazAuto.printGodzPrzybycia().split(":");
            String[] kolejnaGodz = kolejneAuto.printGodzPrzybycia().split(":");

            int terazGodzina = Integer.parseInt(terazGodz[0]);
            int terazMinuta = Integer.parseInt(terazGodz[1]);
            int kolejnaGodzina = Integer.parseInt(kolejnaGodz[0]);
            int kolejnaMinuta = Integer.parseInt(kolejnaGodz[1]);

            int czas = (kolejnaGodzina - terazGodzina) * 60 + (kolejnaMinuta - terazMinuta);

            System.out.println(terazAuto.printNrRejestracyjny() + ", a "  + kolejneAuto.printNrRejestracyjny() + ": " + czas + " minut");

            current = next;
            next = next.next;
        }
    }
	
}