package lab02;

import java.util.Scanner;

public class zad10_3 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tab = new String[8];
        String word;

        System.out.println("Podaj 8 wyrazów: ");
        for (int i = 0; i < tab.length; i++) {
            word = scanner.next();
            tab[i] = word;
        }
        scanner.close();
        int maxIle = 0;
        String maxSamo = "";
        for(int i = 0; i < tab.length; i++) {
        	word = tab[i];
        	int samogloski = 0;
        	for(int j = 0; j < word.length(); j++) {
        		char x = Character.toLowerCase(word.charAt(j));
        		if(x=='a' || x=='e' || x=='i' || x=='u' || x=='y' || x== 'o' || x=='ą' || x=='ę' || x=='ó') {
        			samogloski++;
        		}	
        	}
        	if(samogloski > maxIle ) {
        		maxIle = samogloski;
        		maxSamo = word;
        	}
        }
        System.out.print("Wyraz z największą ilością samogłosek: " + maxSamo);

	}

}
