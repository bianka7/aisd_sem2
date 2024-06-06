package lab02;

import java.util.Random;

public class zad09 {

	public static void main(String[] args) {
		int a = 6;
		int b = 8;
		int[][] tab = new int[a][b];
		int[][] tab2 = new int[b][a];
		Random random = new Random();
		
	System.out.println("Macierz 1");
	for(int k = 0; k < a; k++) { //wiersze
		for(int l = 0; l < b; l++) { //kolumny
			tab[k][l] = random.nextInt(100,300);
			System.out.print(tab[k][l] + " ");
			}
		System.out.println(); //kolejny wiersz
		}
	
	System.out.println(); 
	System.out.println("Macierz 2");		
	for(int i = 0; i < b; i++) { //wiersze
		for(int j = 0; j < a; j++) { //kolumny
			tab2[i][j] = random.nextInt(100,300);
			System.out.print(tab2[i][j] + " ");
			}
		System.out.println(); //kolejny wiersz
		}
	System.out.println();
	
	System.out.println("M1 * M2");
	int[][] wynik = new int[a][a];
	for(int x = 0; x < a; x++) {
		for(int y = 0; y < a; y++) {
			int suma = 0;
			for (int z = 0; z < b; z++) {
                suma += tab[x][z] * tab2[z][y];
            }
            wynik[x][y] = suma;
            System.out.print(wynik[x][y] + " ");
		}
		System.out.println();
	}
	

	

	

	}

}
