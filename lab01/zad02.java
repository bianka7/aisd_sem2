package lab01;

import java.util.Scanner;

public class zad02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x,y,z;
		System.out.print("Podaj pierwszą liczbę: ");
		x = scanner.nextInt();
		System.out.print("Podaj drugą liczbę: ");
		y = scanner.nextInt();
		System.out.print("Podaj trzecią liczbę: ");
		z = scanner.nextInt();

		if(x<y && x<z) {
			System.out.print(x + " jest najmniejszą liczbą");
		}
		else if(y<z && y < x) {
			System.out.print(y + " jest najmniejszą liczbą");
		}
		else if(z < y && z < x) {
			System.out.print(z + " jest najmniejszą liczbą");
		}
		else {
			System.out.print("Liczby są takie same");
		}
		
		scanner.close();
	}
}
