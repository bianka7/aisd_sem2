package lab02;

import java.util.Random;

public class zad02 {

	public static void main(String[] args) {
		double[] tab = new double[12];
		Random random = new Random();
		int a = -100;
		int b = 100;
		int ujemne = 0;
		int dodatnie = 0;
		for(int i = 0; i < tab.length; i++) {
			tab[i] = a + (b-a)*random.nextDouble();
			if(tab[i] < 0) {
				ujemne++;
			}
			else {
				dodatnie++;
			}
			
			//System.out.print(tab[i] + " ");
			System.out.printf("%6.2f", tab[i]);
			}
		System.out.println();
		System.out.println("Ilość liczb dodatnich: " + dodatnie);
		System.out.println("Ilość liczb ujemnych: " + ujemne);
		
		
//tab[i] = -100 + (100-(-100))*random.nextDouble();
//           ^         ^------------
// przesuniecie zera do -100       przedzial 200
	}
}

//System.out.printf("%6.2f", tab[i])