package lab02;

import java.util.Random;

public class zad06 {

	public static void main(String[] args) {
		int[] tab = new int[30];
		Random random = new Random();
		int a = -900;
		int b = 1200;
		for(int i = 0; i < tab.length; i++) {
			tab[i] = a + random.nextInt(b - a + 1);
			System.out.print(tab[i]+" ");
		}
		System.out.println();
		
		//szukanie najwiekszej
		int max = 0;
		for(int j = 0; j<tab.length;j++) {
			if(tab[j]>max) {
				max = tab[j];
			}
		}
		System.out.print("Liczba największa: " + max);
		System.out.println();
		//szukanie najmniejszej
		int min = b;
		for(int k = 0; k < tab.length;k++) {
			if(tab[k] < min) {
				min = tab[k];
			}
		}
		System.out.print("Liczba najmniejsza: " + min);

	}

}
