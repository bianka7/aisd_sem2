package lab02;
import java.util.Scanner;
public class zad07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Podaj liczbę: ");
		int M = scanner.nextInt();	
		scanner.close();
		boolean[] tab = new boolean[M];
		for(int i =2; i<M;i++) {
			tab[i]=true;
		}
		
		for( int i = 2; i*i < M; i++) {
			if(tab[i]) {
				for(int j = i*i  ; j<M;j+=i) {
					tab[j]=false;
				}
			}
		}
		System.out.print("Liczby pierwsze mniejsze od " + M + ": ");
		for(int k = 2; k<M; k++) {
			if(tab[k]==true) {
				System.out.print(k + " ");
			}
		}
		
	}
}
//sito Eratostenesa
//1. z tablicy wyrzucamy wielokrotnosci liczby 2
//2. z tablicy wyrzucamy wielokrotnosci liczby 3
//3. z tablicy wyrzucamy wielokrotnosci liczby 5
//4. z tablicy wyrzucamy wielokrotnosci liczby 7
//Przy eliminacji wystarczy usunąć ze zbioru wielokrotności
//liczb leżących w przedziale od 2 do pierwiastka z  M.
//Jeśli liczba p jest złożona, to musi posiadać 
//czynniki pierwsze w przedziale od 2 do pierwiastka z p.