package lab07;

public class zad06 {

	public static boolean isHeap(int[] T) {
		int x = T.length;
		for(int k = 0; k < x; k++) {
			int rodzic = (k-1)/2;
			if(T[rodzic] < T[k]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] T = {0, 12, 3, 7, 11, 10, 8, 2, 10, 9, 15};
        boolean isHeap = isHeap(T);

        if(isHeap == false) {
        	System.out.print("T nie jest kopcem");
        }
        else {
        	System.out.print("T jest kopcem");
        }
	}
}


/*
Powiązania pomiędzy węzłami określają proste wzory. 
Niech n będzie liczbą węzłów w drzewie, a k numerem węzła. Wtedy:
numer lewego syna = 2k + 1
numer prawego syna = 2k + 2
numer ojca = [(k - 1) / 2], dla k > 0
lewy syn istnieje, jeśli 2k + 1 < n
prawy syn istnieje, jeśli 2k + 2 < n
węzeł k jest liściem, jeśli 2k + 2 > n
Wzory te pozwalają poruszać się po strukturze kopca w górę i w dół.
*/