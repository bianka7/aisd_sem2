package lab02;

import java.util.Random;

public class zad01_2 {

	public static void main(String[] args) {
		int[] tab = new int[12];
		Random random = new Random();
		int x;

		//losowa tablica 12 liczb
		for(int i = 0; i < tab.length; i++) {
			x = random.nextInt(100);
			tab[i] = x;
			System.out.print(tab[i] + " ");
			}
		System.out.println();
		
		//pomocnicza tablica, ktora jest taka sama jak tab 
		int[] tab2 = new int[15];
		for(int z = 0; z < tab.length; z++) {
			tab2[z] = tab[z];
		}
		System.out.println();

		//co jest w tab2 + wstawienie do ostatniego elementu
		for(int k = 0; k < tab2.length; k++) {		
			System.out.print(tab2[k] + " ");
		}
		tab2[tab.length] = 51;
		System.out.println();
		
		//wstawienie do pierwszego elementu
		for(int i = tab2.length-1; i> 0;i--) {
			tab2[i]=tab2[i-1];
			System.out.print(tab2[i] + " ");
		}
		tab2[0]=51;
		System.out.println();
		
		
		//wstawienie do srodkowego elementu
        int indeks = 5;
        for(int l = tab2.length - 1; l > indeks; l--) {
            tab2[l] = tab2[l - 1];
        }
        tab2[indeks] = 51;

        for(int v = 0; v < tab2.length; v++) {
            System.out.print(tab2[v] + " ");
        }        
        
	}
}
