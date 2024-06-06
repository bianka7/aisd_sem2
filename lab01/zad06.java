package lab01;

public class zad06 {
	public static void main(String[] args) {
		int x = 0;
		int suma = 0;
		for(int i = 0; i<=100; i++) {
			suma = x + suma;
			x++;
		}
		System.out.print(suma);
	}
}