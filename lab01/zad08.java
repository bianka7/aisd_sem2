package lab01;

//złożoność tych algorytmów wynosi O(n), 
//gdzie w zadaniu 6  	n = 100 (100 razy wykonuje się pętla for), 
//a w zadaniu 7    		n = 11 (pętla wykonuje się 11 razy)



public class zad08 {

	public static void main(String[] args) {
		
		//do zadania 6
		int i = 100;
		int suma1 = (i * (i+1))/2;
		System.out.println(suma1);
		
		//do zadania 7
		double j = 10;
		double suma2 = Math.pow(2, j+1) - 1;
		System.out.println(suma2);	
	}
}
//możemy zmienić powyższe algorytmy na złożoność O(1)
//wykorzystując wzory
//6. suma wyrazów w ciągu Sn = (n(n+1))/2
//7. suma pierwszych n potęg 2 Sn = 2^(n+1)-1