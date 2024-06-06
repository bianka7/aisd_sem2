package lab01;

import java.util.Scanner;

public class zad04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int x;
		int i = 2;
		System.out.print("Podaj liczbę: ");
		x = scanner.nextInt();
		scanner.close();
		if(x < 2) {
			System.out.print(x + " nie jest liczbą pierwszą");
			
		}
		else if(x>=2){
		for(i = 2 ; i<= Math.sqrt(x); i++) {
			if(x%i==0) {
				System.out.print(x + " nie jest liczbą pierwszą");
				break;
			}
		}
		if (i>Math.sqrt(x)) {
			System.out.print(x + " liczba jest liczbą pierwszą");
			}
		

		
		}
	}
}