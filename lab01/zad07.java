package lab01;

public class zad07 {
	public static void main(String[] args) {
		double x = 0;
		double suma = 0;
		for(int i = 0; i<11; i++) {
			x = Math.pow(2, i);
			suma = x + suma;
			x++;
		}
		System.out.print(suma);
	}
}
