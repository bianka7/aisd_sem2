package lab01;
import java.util.Scanner;
public class zad03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int x;
		int suma = 0;
		int ilosc = 0;
		System.out.print("Podaj liczby do sredniej: ");
		while(true) {
			x = scanner.nextInt();
			if(x==0) {
				break;
			}
			suma = x + suma;
			ilosc++;
		}

		double srednia;
		srednia = (double) suma/ilosc;
		System.out.println("suma: " + suma);
		System.out.print("srednia: " + srednia);
	
		scanner.close();
	}
}