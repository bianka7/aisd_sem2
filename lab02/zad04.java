package lab02;

import java.util.Random;

public class zad04 {

	public static void main(String[] args) {
		int a = 8;
		int b = 8;
		int[][] tab = new int[a][b];
		Random random = new Random();

	for(int i = 0; i < a; i++) { //wiersze
		for(int j = 0; j < b; j++) { //kolumny
			tab[i][j] = random.nextInt(10,40);
			if(i!=j && i > j ) {
				tab[i][j]=0;
			}
			if(tab[i][j] >= 10) {
			System.out.print(tab[i][j] + " ");
			}
			else {
				System.out.print(tab[i][j] + "  ");
				}
			}
		System.out.println(); //kolejny wiersz
		}
	}

}
//0,0 
//1,0 1,1
//2,0 2,1 2,2
//3,0 3,1 3,2 3,3
//4,0 4,1 4,2 4,3 4,4
//5,0 5,1 5,2 5,3 5,4 5,5
//6,0 6,1 6,2 6,3 6,4 6,5 6,6
//7,0 7,1 7,2 7,3 7,4 7,5 7,6 7,7
//8,0 8,1 8,2 8,3 8,4 8,5 8,6 8,7 8,8