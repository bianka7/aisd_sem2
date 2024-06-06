package lab01;
import java.util.Random;
public class zad10 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] tab = new int[12];
		for(int i = 0; i < tab.length;i++) {
			tab[i]=random.nextInt(101);
		}
		int ile = 0;
		
		for(int j=0; j<tab.length;j++) {
			if(tab[j]%2 ==0) {
				ile++;
			}
		}
		System.out.print("Ilość liczb parzystych: " + ile);
	}

}
