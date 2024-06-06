package lab02;
import java.util.Scanner;

public class zad10_2 {

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
        String maxLitery = "";

        for (int i = 0; i < tab.length; i++) {
            word = tab[i];
            int ile = 0;
            for (int j = 0; j < word.length(); j++) {
                if (Character.isUpperCase(word.charAt(j))) {
                    ile++;
                }
            }
            if (ile > maxIle) {
                maxIle = ile;
                maxLitery = word;
            }
        }
        System.out.println("Najwięcej wielkich liter w wyrazie: " + maxLitery);
    }
}

