package lab02;
import java.util.Random;
public class zad01_1 {
	public static void main(String[] args) {
		int[] tab = new int[12];
		Random random = new Random();
		int x;
		
		for(int i = 0; i < tab.length; i++) {
			x = random.nextInt(100);
			tab[i] = x;
			System.out.print(tab[i] + " ");
			}
		System.out.println();
		
		if(tab[0]>tab[tab.length-1]) {
			System.out.println("Pierwsza liczba jest większa");
		}
		else {
			System.out.println("Druga liczba jest większa");
		}
	}
}
