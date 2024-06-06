package lab01;
import java.util.Random;
import java.util.Arrays;
public class zad11_2 {

	public static void main(String[] args) {

		int[] tablica = new int[30];
		int x;
		Random random = new Random();
		for(int i=0; i<tablica.length;i++) {
		x = random.nextInt(41) + 10; //przesuwa o 10 jednostek
		tablica[i] = x;
		}
		Arrays.sort(tablica);
		 for (int liczba : tablica) {
	            System.out.print(liczba + " ");
	        }
	        System.out.println();
		
		int y = 31;

		int lewo = 0;
		int prawo = tablica.length - 1;
		int p = -1; //wartość początkowa
		
		while(lewo <= prawo) {
			int srodek = ((lewo + prawo) / 2);
			
			if(y == tablica[srodek]) {
			p = srodek;
			break;
			}
			else if (y<tablica[srodek]) {
			prawo = srodek - 1;
			}
			else {
				lewo = srodek + 1;
			}
		}
		
		if(p != -1 ) {
			System.out.print("Liczba 31 wystepuje w tablicy na pozycji " + p );
		}
		else {
			System.out.print("Liczba 31 nie występuje w tablicy.");
		
		}
	}
}
