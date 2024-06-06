package lab01;

import java.util.Scanner;
public class zad01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x,y;
		System.out.println("Podaj pierwszą liczbę: ");
		x = scanner.nextInt();
		System.out.println("Podaj drugą liczbę: ");
		y = scanner.nextInt();
		
		if (x>y) {
			System.out.print(x + " jest większą liczbą.");
		}
		else if(y > x) {
			System.out.print(y + " jest większą liczbą.");
		}
		else {
			System.out.print("Liczby są takie same. ");
		}
		scanner.close();
	}
}
