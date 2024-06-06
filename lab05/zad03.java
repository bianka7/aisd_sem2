package lab05;

public class zad03 {

	public static void main(String[] args) {
		KolejkaString kolejka = new KolejkaString();

		kolejka.Enqueue("ala");
		kolejka.Enqueue("maja");
		kolejka.Enqueue("adam");
		kolejka.Enqueue("karol");
		kolejka.Enqueue("daniel");
		
		//a) pierwsza i ostatnia osoba
		KolejkaString.printFirst();
		
		System.out.println();
		
		//b) ile kobiet
		KolejkaString.ileKobiet();
		
		
		
	}

}
