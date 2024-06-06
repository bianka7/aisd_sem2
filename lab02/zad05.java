package lab02;

import java.util.Random;

public class zad05 {

	public static void main(String[] args) {
		int[] tab = new int[12];
		Random random = new Random();
		int x;
		System.out.print("Tablica wygenerowana: ");
		for(int i = 0; i < tab.length; i++) {
			x = random.nextInt(40)+10;
			tab[i] = x;
			System.out.print(tab[i] + " ");
			}
		System.out.println();
		
		System.out.print("Tablica odwrócona: ");
//odwrocenie tablicy tab z wykorzystaniem tablicy pomocniczej tab2
		int[] tab2 = new int[12];
		for(int j = 0; j < tab.length; j++) {
			tab2[j] = tab[tab.length-1-j];
		}
		
		for(int k = 0; k <= tab2.length-1;k++) {
			System.out.print(tab2[k] + " ");
		}

	}

}
