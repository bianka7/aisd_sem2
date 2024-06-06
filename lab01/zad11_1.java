package lab01;
import java.util.Random;
public class zad11_1 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] tab = new int[30];
		for(int i = 0; i < tab.length; i++) {
			tab[i] = random.nextInt(40)+11;
			System.out.print(tab[i] + " ");
		}
		System.out.println();
		
		int indeks = 0;
		for(int j = 0; j<tab.length;j++) {
			if(tab[j] == 31) {
				indeks = j;
				break;
			}
		}
		
		if (indeks != 0) {
			System.out.println("Liczba 31 znajduje się na indeksie " + indeks);
		}
		else {
			System.out.println("Liczby 31 nie ma w tablicy");
		}
	}
}
