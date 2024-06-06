package lab01;

import java.util.Scanner;

public class zad09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x;
		int i = 0;
		int[] tab = new int[6];
		while(i < 6) {
			x = scanner.nextInt();			
			tab[i] = x;
			i++;
		}
		for(int j = 0; j <tab.length;j++) {
			System.out.print(tab[j]+ " ");
		}
		
		scanner.close();
	}

}
