package lab08;

public class zad01 {

	public static boolean isHeap(int[] T) {
		for(int k=1; k<T.length; k++) {
	        if(k < T.length/2) {	
	        	if(T[k]<T[2*k] || T[k]<T[2*k+1]) {
	        		return false;
	        	}
	        }
		}
		return true;
	}
	
	public static void main(String[] args) {
		//int[] T={0, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; 
		int[] T={0, 12, 3, 7, 11, 10, 8, 2, 10, 9, 15};
		
		
		if(isHeap(T)) {
			System.out.print("jest kopcem");
		}
		else {
			System.out.print("nie jest kopcem");
		}
	}
}

















/*
Niech n będzie liczbą węzłów w drzewie, a k numerem węzła. Wtedy:
numer lewego syna = 2k + 1
numer prawego syna = 2k + 2
numer ojca = [(k - 1) / 2], dla k > 0
lewy syn istnieje, jeśli 2k + 1 < n
prawy syn istnieje, jeśli 2k + 2 < n
węzeł k jest liściem, jeśli 2k + 2 > n
Wzory te pozwalają poruszać się po strukturze kopca w górę i w dół.
*/