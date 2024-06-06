package lab09;
import java.util.GregorianCalendar;

public class KolejkaPriorytetowaC {
    
    private Pacjent[] rq; //tablica uporządkowana malejąco
    private int n; //liczba elementow
    
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
    
    public KolejkaPriorytetowaC(int capacity) {
        rq = new Pacjent[capacity]; // tablica N elementow
        n = 0;
    }
    
    void insert(Pacjent p) {
        int i;
        for (i = n - 1; i >= 0 && p.data.get(GregorianCalendar.YEAR) > rq[i].data.get(GregorianCalendar.YEAR); i--) {
            rq[i + 1] = rq[i]; //przesuwamy elementy w prawo
        }
        rq[i + 1] = p; //wstawiamy nowego pacjenta w nowe miejsce
        n++;
    }
    
    public Pacjent delMax() {
        Pacjent max = rq[--n]; //usuwa ostatniego pacjenta z tablicy
        rq[n] = null; //usuwa referencję do ostatniego pacjenta
        return max;
    }
    
    public void print() {
        for (int i = 0; i < n; i++) {
            System.out.println(rq[i]);
        }
    }
    
    public static void main(String[] args) {
        KolejkaPriorytetowaC kolejka = new KolejkaPriorytetowaC(8);
        
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
