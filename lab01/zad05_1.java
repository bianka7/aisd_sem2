package lab01;
import java.util.Scanner;
public class zad05_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x,y;
		System.out.println("Podaj liczbę: ");
		x = scanner.nextInt();
		System.out.println("Podaj liczbę: ");
		y = scanner.nextInt();
	
		while (y!=0) {
			int pom = y;
			y = x % y;
			x = pom;
		}
		System.out.println("NWD: " + x);
		scanner.close();
	}
}