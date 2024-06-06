package lab02;
import java.util.Scanner;

public class zad10_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] tab  = new String[8];
		//String word ;
		
		System.out.println("Podaj 8 wyrazów: ");
		for(int i = 0; i < tab.length; i++) {
			String word = scanner.next();
			tab[i] = word;
		}
		
		scanner.close();

		int[] tab2 = new int[tab.length];
		for(int j = 0; j < tab.length; j++) {
			tab2[j] = tab[j].length();
		}
		
		int max = 0;
		for(int k = 0; k < tab.length; k++) {
			if(tab2[k] > tab2[max]) {
				max = k ;
			}	
		}
		System.out.print("Najdłuższy wyraz: " + tab[max]);
	}
	
}
