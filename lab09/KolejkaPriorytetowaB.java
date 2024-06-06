package lab09;
import java.util.GregorianCalendar;

public class KolejkaPriorytetowaB {
    
    private Pacjent[] rq; // tablica nieuporządkowana
    private int n; // liczba elementów w kolejce
    
    private static class Pacjent {
        String imie;
        String nazwisko;
        GregorianCalendar data;
        
        Pacjent(String im, String naz, GregorianCalendar d){
            imie = im;
            nazwisko = naz;
            data = d;
        }
        
        public String toString() {
            return imie + " " + nazwisko + " " + data.getTime().toString();
        }
    }   
    
    public KolejkaPriorytetowaB(int capacity) {
        rq = new Pacjent[capacity]; //tablica N elementow
        n = 0;
    }
    
    void insert(Pacjent p) {
        rq[n++] = p; //dodajemy do tablicy kolejne osoby
    }
    
    public Pacjent delMax() {
        int maxI = 0; //maksymalny indeks
        for (int i = 1; i < n; i++) {    //  porownywanie kolejnych dat
            if (rq[i].data.get(GregorianCalendar.YEAR) < rq[maxI].data.get(GregorianCalendar.YEAR)) {
            	maxI = i; 
            }
        }
        Pacjent max = rq[maxI]; //zapisywanie pacjenta o maksymalnym indeksie
        rq[maxI] = rq[--n]; //usuwanie maksymalnego indeksu
        rq[n] = null; //usuwa referencje do ostatniego pacjenta
        return max;
    }
    
    public void print() {
        for (int i = 0; i < n; i++) {
            System.out.println(rq[i]);
        }
    }
    
    public static void main(String[] args) {
        KolejkaPriorytetowaB kolejka = new KolejkaPriorytetowaB(8);
        
        kolejka.insert(new Pacjent("Jan", "Kowalski", new GregorianCalendar(1961, 9, 20)));
        kolejka.insert(new Pacjent("Tamara", "Bykowska", new GregorianCalendar(1929, 1, 10)));
        kolejka.insert(new Pacjent("Marian", "Baranowski", new GregorianCalendar(1958, 12, 5)));
        kolejka.insert(new Pacjent("Katarzyna", "Makowska", new GregorianCalendar(1972, 5, 7)));
        kolejka.insert(new Pacjent("Joanna", "Groth", new GregorianCalendar(1942, 7, 15)));
        kolejka.insert(new Pacjent("Monika", "Włodarska", new GregorianCalendar(1964, 2, 27)));
        kolejka.insert(new Pacjent("Kazimierz", "Nowakowski", new GregorianCalendar(1937, 3, 21)));
        kolejka.insert(new Pacjent("Waldemar", "Chamerski", new GregorianCalendar(1978, 11, 11)));
        
        kolejka.print();   
        kolejka.delMax();
        System.out.println();
        
        kolejka.print();
        kolejka.delMax();
        System.out.println();
        
        kolejka.print();
        kolejka.delMax();
        System.out.println();
        
        kolejka.insert(new Pacjent("Anna", "Maliszewska", new GregorianCalendar(1981, 8, 3)));
        kolejka.print();
        System.out.println();
    }
}

