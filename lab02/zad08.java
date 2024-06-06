package lab02;
import java.util.Scanner;
import java.util.Random;

public class zad08 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Podaj M: ");
	int M = scanner.nextInt();
	System.out.println("Podaj N: ");
	int N = scanner.nextInt();	
	scanner.close();
	int[][] tab = new int[M][N];
	Random random = new Random();
	int a = -50;
	int b = 50;
	System.out.println("Macierz MxN");
	for(int i = 0; i < M; i++) { //wiersze
		for(int j = 0; j < N; j++) { //kolumny
			tab[i][j] = a + random.nextInt(b-a+1);
			
			if(tab[i][j] >= 10) {
				System.out.print(tab[i][j] + "   ");
		}
		else if(tab[i][j] <= -10) {
			System.out.print(tab[i][j] + "  ");
		}
		else{
			System.out.print(tab[i][j] + "    ");
		}
	}
		System.out.println();
		}
	
	int[][] tab2 = new int [N][M]; 
	for(int c = 0; c < tab2.length; c++) {
		for(int d = 0; d< M; d++) {
			tab2[c][d]=tab[d][c];
		}
	}
	
	
	
	
	System.out.println("Transpozycja macierzy MxN");
	for(int k = 0; k < N; k++) { //wiersze
		for(int l = 0; l < M; l++) { //kolumny
			if(tab2[k][l] >= 10) {
				System.out.print(tab2[k][l] + "   ");
		}
		else if(tab2[k][l] <= -10) {
			System.out.print(tab2[k][l] + "  ");
		}
		else{
			System.out.print(tab2[k][l] + "    ");
		}
		}
		
		System.out.println();
		}
	}
}