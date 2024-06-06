package lab01;
import java.util.Scanner;
public class zad05_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x,y;
		System.out.println("Podaj liczbę: ");
		x = scanner.nextInt();
		System.out.println("Podaj liczbę: ");
		y = scanner.nextInt();
		
		int a = x;
		int b = y;
		
		while (y!=0) {
			int pom = y;
			y = x % y;
			x = pom;
		}
		int NWD = x;
		
		int NWW = (a*b)/NWD;
		
		System.out.print("NWW: "+NWW);
		scanner.close();
	}
}