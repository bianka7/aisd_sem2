package lab02;

import java.util.Random;

public class zad01_3 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] tab = new int[12];
		
		for(int i = 0; i < tab.length; i++) {
			tab[i] = random.nextInt(101);
			System.out.print(tab[i]+" ");
		}
		
		//int indeks = 0;
		//int indeks = tab.length;
		int indeks = 5;
		
//przesuwa kazdy element w lewo od podanego indeksu   
//j+1 jest kopiowane do j
	    for (int j = indeks; j < tab.length - 1; j++) {
	        tab[j] = tab[j + 1];
	    }
	    
		System.out.println();
		
		tab[tab.length-1]=0; //po usunięciu ostatnia liczba będzie wyświetlana jako 0
	    for(int k = 0; k<tab.length;k++) {
	    	System.out.print(tab[k]+" ");
	}

	}
}