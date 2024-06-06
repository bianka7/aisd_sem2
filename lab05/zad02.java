package lab05;

public class zad02 {

	public static void main(String[] args) {
		KolejkaString kolejka = new KolejkaString();
		
		kolejka.Enqueue("one");
		kolejka.Enqueue("two");
		KolejkaString.print(); //przybyly 2
		System.out.println(kolejka.size());
		
		kolejka.Dequeue(); //wszedl 1
		kolejka.Dequeue(); //wszedl 1
		KolejkaString.print();
		System.out.println(kolejka.size());
		
		kolejka.Enqueue("three"); //przybylo 2
		kolejka.Enqueue("four");
		KolejkaString.print();
		
		System.out.println(kolejka.size());
		
		kolejka.Dequeue(); //wszedl 1
		KolejkaString.print();
		System.out.println(kolejka.size());
		
		kolejka.Enqueue("five"); //przybyl 1
		KolejkaString.print();
		System.out.println(kolejka.size());
		
		kolejka.Dequeue(); //wszedl 1
		kolejka.Dequeue(); //wszedl 1
		System.out.println(kolejka.size());
	}
}
